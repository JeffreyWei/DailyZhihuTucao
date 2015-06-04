package com.babibeng.shimao.sun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_customer_shoppingcart")
public class CustomerShoppingCart {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
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
     * 创建时间
     */
    private Date addtime;

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
     * 获取创建时间
     *
     * @return addtime - 创建时间
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * 设置创建时间
     *
     * @param addtime 创建时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}