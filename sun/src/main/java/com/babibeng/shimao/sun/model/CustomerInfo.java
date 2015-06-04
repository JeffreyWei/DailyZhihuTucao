package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "t_customer_info")
public class CustomerInfo {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 账号名称
     */
    private String name;

    /**
     * 账号密码
     */
    private String password;

    /**
     * 状态（1正常，0无效）
     */
    private Integer state;

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
     * 获取账号名称
     *
     * @return name - 账号名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置账号名称
     *
     * @param name 账号名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取账号密码
     *
     * @return password - 账号密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置账号密码
     *
     * @param password 账号密码
     */
    public void setPassword(String password) {
        this.password = password;
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