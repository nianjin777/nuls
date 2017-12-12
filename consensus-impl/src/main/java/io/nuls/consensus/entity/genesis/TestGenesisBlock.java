package io.nuls.consensus.entity.genesis;

import io.nuls.consensus.entity.NulsBlock;
import io.nuls.core.chain.entity.BlockHeader;
import io.nuls.core.chain.entity.NulsDigestData;
import io.nuls.core.utils.date.DateUtil;

/**
 * @author Niels
 * @date 2017/11/10
 */
public final class TestGenesisBlock extends NulsBlock {

    private static final TestGenesisBlock INSTANCE = new TestGenesisBlock();

    public static TestGenesisBlock getInstance() {
        return INSTANCE;
    }

    private TestGenesisBlock() {
        this.setHeader(new BlockHeader());
        this.setCountOfRound(1);
        this.setOrderInRound(1);
        this.setRoundStartTime(DateUtil.convertStringToDate("2017-12-10 00:00:00").getTime());
        initGengsisTxs();
        fillHeader();
    }

    private void fillHeader() {
        //todo temp
        this.getHeader().setHash(new NulsDigestData());
    }

    private void initGengsisTxs() {
        //todo 总nuls量及每个地址的nuls量
    }

}
