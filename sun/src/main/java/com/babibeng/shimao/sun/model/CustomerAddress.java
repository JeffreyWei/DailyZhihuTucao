package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "t_customer_address")
public class CustomerAddress {
    @Id
    private Integer id;

    /**
     * 客户ID
     */
    private Integer customerid;

    /**
     * 邮编
     */
    private String post;

    /**
     * 地址
     */
    private String address;

    /**
     * 收货电话
     */
    private String linkephone;

    /**
     * 收货人
     */
    private String linkman;

    /**
     * 备注
     */
    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取客户ID
     *
     * @return customerid - 客户ID
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * 设置客户ID
     *
     * @param customerid 客户ID
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * 获取邮编
     *
     * @return post - 邮编
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置邮编
     *
     * @param post 邮编
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取收货电话
     *
     * @return linkephone - 收货电话
     */
    public String getLinkephone() {
        return linkephone;
    }

    /**
     * 设置收货电话
     *
     * @param linkephone 收货电话
     */
    public void setLinkephone(String linkephone) {
        this.linkephone = linkephone;
    }

    /**
     * 获取收货人
     *
     * @return linkman - 收货人
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 设置收货人
     *
     * @param linkman 收货人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}