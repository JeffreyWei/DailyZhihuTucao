package com.babibeng.shimao.sun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_public_info")
public class PublicInfo {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 商品ID
     */
    private Integer goodsid;

    /**
     * 主题ID
     */
    private Integer topicid;

    private Integer state;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 中奖客户ID
     */
    private Integer customerid;

    /**
     * 抽奖时间
     */
    private Date lucytime;

    /**
     * 是否发货（0未发货，1已发货）
     */
    private Integer isdeliver;

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
     * 获取商品ID
     *
     * @return goodsid - 商品ID
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品ID
     *
     * @param goodsid 商品ID
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取主题ID
     *
     * @return topicid - 主题ID
     */
    public Integer getTopicid() {
        return topicid;
    }

    /**
     * 设置主题ID
     *
     * @param topicid 主题ID
     */
    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取中奖客户ID
     *
     * @return customerid - 中奖客户ID
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * 设置中奖客户ID
     *
     * @param customerid 中奖客户ID
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * 获取抽奖时间
     *
     * @return lucytime - 抽奖时间
     */
    public Date getLucytime() {
        return lucytime;
    }

    /**
     * 设置抽奖时间
     *
     * @param lucytime 抽奖时间
     */
    public void setLucytime(Date lucytime) {
        this.lucytime = lucytime;
    }

    /**
     * 获取是否发货（0未发货，1已发货）
     *
     * @return isdeliver - 是否发货（0未发货，1已发货）
     */
    public Integer getIsdeliver() {
        return isdeliver;
    }

    /**
     * 设置是否发货（0未发货，1已发货）
     *
     * @param isdeliver 是否发货（0未发货，1已发货）
     */
    public void setIsdeliver(Integer isdeliver) {
        this.isdeliver = isdeliver;
    }
}