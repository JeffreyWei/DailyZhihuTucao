package com.babibeng.shimao.sun.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_customer_account")
public class CustomerAccount {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 客户ID
     */
    private Integer customerid;

    /**
     * 资金余额
     */
    private BigDecimal balance;

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
     * 获取资金余额
     *
     * @return balance - 资金余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置资金余额
     *
     * @param balance 资金余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}