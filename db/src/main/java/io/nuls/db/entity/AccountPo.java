package io.nuls.db.entity;

public class AccountPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.create_time
     *
     * @mbg.generated
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.alias
     *
     * @mbg.generated
     */
    private String alias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.version
     *
     * @mbg.generated
     */
    private Short version = 0;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.pri_key
     *
     * @mbg.generated
     */
    private String priKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.pub_key
     *
     * @mbg.generated
     */
    private byte[] pubKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.tx_hash
     *
     * @mbg.generated
     */
    private byte[] txHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.pri_seed
     *
     * @mbg.generated
     */
    private byte[] priSeed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.EXTEND
     *
     * @mbg.generated
     */
    private byte[] extend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.address
     *
     * @return the value of account.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.address
     *
     * @param address the value for account.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.create_time
     *
     * @return the value of account.create_time
     *
     * @mbg.generated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.create_time
     *
     * @param createTime the value for account.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.alias
     *
     * @return the value of account.alias
     *
     * @mbg.generated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.alias
     *
     * @param alias the value for account.alias
     *
     * @mbg.generated
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.version
     *
     * @return the value of account.version
     *
     * @mbg.generated
     */
    public Short getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.version
     *
     * @param version the value for account.version
     *
     * @mbg.generated
     */
    public void setVersion(Short version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.pri_key
     *
     * @return the value of account.pri_key
     *
     * @mbg.generated
     */
    public String getPriKey() {
        return priKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.pri_key
     *
     * @param priKey the value for account.pri_key
     *
     * @mbg.generated
     */
    public void setPriKey(String priKey) {
        this.priKey = priKey == null ? null : priKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.pub_key
     *
     * @return the value of account.pub_key
     *
     * @mbg.generated
     */
    public byte[] getPubKey() {
        return pubKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.pub_key
     *
     * @param pubKey the value for account.pub_key
     *
     * @mbg.generated
     */
    public void setPubKey(byte[] pubKey) {
        this.pubKey = pubKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.tx_hash
     *
     * @return the value of account.tx_hash
     *
     * @mbg.generated
     */
    public byte[] getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.tx_hash
     *
     * @param txHash the value for account.tx_hash
     *
     * @mbg.generated
     */
    public void setTxHash(byte[] txHash) {
        this.txHash = txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.pri_seed
     *
     * @return the value of account.pri_seed
     *
     * @mbg.generated
     */
    public byte[] getPriSeed() {
        return priSeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.pri_seed
     *
     * @param priSeed the value for account.pri_seed
     *
     * @mbg.generated
     */
    public void setPriSeed(byte[] priSeed) {
        this.priSeed = priSeed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.EXTEND
     *
     * @return the value of account.EXTEND
     *
     * @mbg.generated
     */
    public byte[] getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.EXTEND
     *
     * @param extend the value for account.EXTEND
     *
     * @mbg.generated
     */
    public void setExtend(byte[] extend) {
        this.extend = extend;
    }
}