package com.babibeng.shimao.sun.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_customer_accountlog")
public class CustomerAccountLog {
    @Id
    private Integer id;

    /**
     * 客户ID
     */
    private Integer customerid;

    /**
     * 发布ID
     */
    private Integer billid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 资金变化（正为增加，负为减少）
     */
    private BigDecimal amount;

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
     * @return billid - 发布ID
     */
    public Integer getBillid() {
        return billid;
    }

    /**
     * 设置发布ID
     *
     * @param billid 发布ID
     */
    public void setBillid(Integer billid) {
        this.billid = billid;
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

    /**
     * 获取资金变化（正为增加，负为减少）
     *
     * @return amount - 资金变化（正为增加，负为减少）
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置资金变化（正为增加，负为减少）
     *
     * @param amount 资金变化（正为增加，负为减少）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}