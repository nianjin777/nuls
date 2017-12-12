package io.nuls.account.service.intf;


import io.nuls.account.entity.Account;
import io.nuls.account.entity.Address;
import io.nuls.core.chain.entity.NulsSignData;
import io.nuls.core.chain.entity.Result;

import java.util.List;

/**
 * @author Niels
 */
public interface AccountService {
    Account createAccount();

    void resetKey(Account account,String password);

    Account getLocalAccount();

    List<Account> getLocalAccountList();

    Account getAccount(String address);

    Address getAddress(String pubKey);

    byte[] getPriKey(String address);

    void switchAccount(String id);

    String getDefaultAccount();

    Result changePassword(String oldpw, String newpw);

    Result setPassword(String password);

    Result lockAccounts();

    Result unlockAccounts(String passwd);

    NulsSignData signData(byte[] bytes);
}
