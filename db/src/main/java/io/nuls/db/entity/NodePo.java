/**
 * MIT License
 *
 * Copyright (c) 2017-2018 nuls.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.nuls.db.entity;

/**
 * @author Niels
 * @date 2017/11/20
 */
public class NodePo {

    private String id;

    private String ip;

    private Integer port;

    private Long lastTime;

    private Long lastFailTime;

    private Integer failCount;

    /**
     *  0 : white
     *  1 : yellow
     *  2 : black
     */
    public static final int WHITE = 0;
    public static final int YELLOW = 1;
    public static final int BLACK = 2;
    private Integer status;

    private Integer magicNum;

    private Short version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.id
     *
     * @return the value of node.id
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.id
     *
     * @param id the value for node.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.ip
     *
     * @return the value of node.ip
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.ip
     *
     * @param ip the value for node.ip
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.port
     *
     * @return the value of node.port
     * @mbg.generated
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.port
     *
     * @param port the value for node.port
     * @mbg.generated
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.last_time
     *
     * @return the value of node.last_time
     * @mbg.generated
     */
    public Long getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.last_time
     *
     * @param lastTime the value for node.last_time
     * @mbg.generated
     */
    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.magic_num
     *
     * @return the value of node.magic_num
     * @mbg.generated
     */
    public Integer getMagicNum() {
        return magicNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.magic_num
     *
     * @param magicNum the value for node.magic_num
     * @mbg.generated
     */
    public void setMagicNum(Integer magicNum) {
        this.magicNum = magicNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.version
     *
     * @return the value of node.version
     * @mbg.generated
     */
    public Short getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.version
     *
     * @param version the value for node.version
     * @mbg.generated
     */
    public void setVersion(Short version) {
        this.version = version;
    }

    public Integer getFailCount() {
        if(failCount == null) {
            failCount = 0 ;
        }
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Long getLastFailTime() {
        return lastFailTime;
    }

    public void setLastFailTime(Long lastFailTime) {
        this.lastFailTime = lastFailTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
