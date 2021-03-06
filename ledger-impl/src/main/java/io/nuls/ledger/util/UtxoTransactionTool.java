/**
 * MIT License
 * <p>
 * Copyright (c) 2017-2018 nuls.io
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.nuls.ledger.util;

import io.nuls.account.entity.Address;
import io.nuls.account.service.intf.AccountService;
import io.nuls.core.chain.entity.Na;
import io.nuls.core.chain.entity.NulsDigestData;
import io.nuls.core.chain.entity.Transaction;
import io.nuls.core.context.NulsContext;
import io.nuls.core.exception.NulsException;
import io.nuls.core.utils.str.StringUtils;
import io.nuls.ledger.entity.UtxoBalance;
import io.nuls.ledger.entity.UtxoData;
import io.nuls.ledger.entity.UtxoInput;
import io.nuls.ledger.entity.UtxoOutput;
import io.nuls.ledger.entity.params.CoinTransferData;
import io.nuls.ledger.entity.tx.AbstractCoinTransaction;
import io.nuls.ledger.entity.tx.LockNulsTransaction;
import io.nuls.ledger.entity.tx.TransferTransaction;
import io.nuls.ledger.service.impl.LedgerCacheService;

/**
 * @author Niels
 */
public class UtxoTransactionTool {

    private static UtxoTransactionTool instance = new UtxoTransactionTool();

    private UtxoTransactionTool() {

    }

    public static UtxoTransactionTool getInstance() {
        return instance;
    }

    private AccountService accountService;

    private LedgerCacheService ledgerCacheService = LedgerCacheService.getInstance();

    public TransferTransaction createTransferTx(CoinTransferData transferData, String password, String remark) throws Exception {
        TransferTransaction tx = new TransferTransaction(transferData, password);
        tx.setRemark(remark.getBytes(NulsContext.DEFAULT_ENCODING));
        tx.setHash(NulsDigestData.calcDigestData(tx.serialize()));

        tx.setSign(getAccountService().signData(tx.getHash(), password));
        return tx;
    }

    public LockNulsTransaction createLockNulsTx(CoinTransferData transferData, String password, String remark) throws Exception {
        LockNulsTransaction tx = new LockNulsTransaction(transferData, password);
        if (StringUtils.isNotBlank(remark)) {
            tx.setRemark(remark.getBytes(NulsContext.DEFAULT_ENCODING));
        }
        tx.setHash(NulsDigestData.calcDigestData(tx.serialize()));
        tx.setSign(getAccountService().signData(tx.getHash(), password));
        return tx;
    }

    /**
     * check the tx is mine
     * when any input or output has my address
     *
     * @param tx
     * @return
     */
    public boolean isMine(AbstractCoinTransaction tx) throws NulsException {
        if (tx.isLocalTx()) {
            return true;
        }
        if (NulsContext.LOCAL_ADDRESS_LIST.isEmpty()) {
            return false;
        }

        UtxoData coinData = (UtxoData) tx.getCoinData();
        //check input
        for (UtxoInput input : coinData.getInputs()) {
            UtxoOutput unSpend = ledgerCacheService.getUtxo(input.getKey());
            if (unSpend == null) {
                continue;
            }
            if (NulsContext.LOCAL_ADDRESS_LIST.contains(Address.fromHashs(unSpend.getAddress()).getBase58())) {
                tx.setLocalTx(true);
                tx.setTransferType(Transaction.TRANSFER_SEND);
                return true;
            }
        }

        // check output
        for (UtxoOutput output : coinData.getOutputs()) {
            if (NulsContext.LOCAL_ADDRESS_LIST.contains(Address.fromHashs(output.getAddress()).getBase58())) {
                tx.setLocalTx(true);
                tx.setTransferType(Transaction.TRANSFER_RECEIVE);
                return true;
            }
        }
        return false;
    }

    public void calcBalance(String address) {
        UtxoBalance balance = (UtxoBalance) ledgerCacheService.getBalance(address);
        if (balance == null) {
            return;
        }

        long useable = 0;
        long lock = 0;
        for (UtxoOutput output : balance.getUnSpends()) {
            if (output.getStatus() == UtxoOutput.USEABLE) {
                useable += output.getValue();
            } else if (output.getStatus() == UtxoOutput.LOCKED) {
                lock += output.getValue();
            }
        }
        balance.setLocked(Na.valueOf(lock));
        balance.setUseable(Na.valueOf(useable));
        balance.setBalance(balance.getUseable().add(balance.getLocked()));
    }

    public void calcBalance(Address address) {
        calcBalance(address.getBase58());
    }

    private AccountService getAccountService() {
        if (accountService == null) {
            accountService = NulsContext.getServiceBean(AccountService.class);
        }
        return accountService;
    }

}
