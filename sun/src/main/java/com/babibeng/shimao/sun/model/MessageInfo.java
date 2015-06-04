package com.babibeng.shimao.sun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_message_info")
public class MessageInfo {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 来源客户ID
     */
    private Integer customerid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 来源类型
     */
    private String origintype;

    /**
     * 状态（0未发送，1已发送）
     */
    private Integer state;

    /**
     * 发送内容
     */
    private String context;

    /**
     * 手机号
     */
    private String phone;

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
     * 获取来源客户ID
     *
     * @return customerid - 来源客户ID
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * 设置来源客户ID
     *
     * @param customerid 来源客户ID
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
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
     * 获取来源类型
     *
     * @return origintype - 来源类型
     */
    public String getOrigintype() {
        return origintype;
    }

    /**
     * 设置来源类型
     *
     * @param origintype 来源类型
     */
    public void setOrigintype(String origintype) {
        this.origintype = origintype;
    }

    /**
     * 获取状态（0未发送，1已发送）
     *
     * @return state - 状态（0未发送，1已发送）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（0未发送，1已发送）
     *
     * @param state 状态（0未发送，1已发送）
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取发送内容
     *
     * @return context - 发送内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置发送内容
     *
     * @param context 发送内容
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}