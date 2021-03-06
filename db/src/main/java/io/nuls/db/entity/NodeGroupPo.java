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
public class NodeGroupPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node_group.hid
     *
     * @mbg.generated
     */
    private Integer hid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node_group.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node_group.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node_group.hid
     *
     * @return the value of node_group.hid
     *
     * @mbg.generated
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node_group.hid
     *
     * @param hid the value for node_group.hid
     *
     * @mbg.generated
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node_group.name
     *
     * @return the value of node_group.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node_group.name
     *
     * @param name the value for node_group.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node_group.version
     *
     * @return the value of node_group.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node_group.version
     *
     * @param version the value for node_group.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}
