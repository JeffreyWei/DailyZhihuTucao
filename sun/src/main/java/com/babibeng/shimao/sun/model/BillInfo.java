package com.babibeng.shimao.sun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bill_info")
public class BillInfo {
    @Id
    private Integer id;

    /**
     * 客户ID
     */
    private Integer customerid;

    /**
     * 发布ID
     */
    private Integer publicid;

    /**
     * 购买份数
     */
    private Integer paycount;

    /**
     * 购买时间
     */
    private Date paytime;

    /**
     * 状态（1正常，0无效）
     */
    private Integer state;

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
     * 获取发布ID
     *
     * @return publicid - 发布ID
     */
    public Integer getPublicid() {
        return publicid;
    }

    /**
     * 设置发布ID
     *
     * @param publicid 发布ID
     */
    public void setPublicid(Integer publicid) {
        this.publicid = publicid;
    }

    /**
     * 获取购买份数
     *
     * @return paycount - 购买份数
     */
    public Integer getPaycount() {
        return paycount;
    }

    /**
     * 设置购买份数
     *
     * @param paycount 购买份数
     */
    public void setPaycount(Integer paycount) {
        this.paycount = paycount;
    }

    /**
     * 获取购买时间
     *
     * @return paytime - 购买时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * 设置购买时间
     *
     * @param paytime 购买时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * 获取状态（1正常，0无效）
     *
     * @return state - 状态（1正常，0无效）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（1正常，0无效）
     *
     * @param state 状态（1正常，0无效）
     */
    public void setState(Integer state) {
        this.state = state;
    }
}