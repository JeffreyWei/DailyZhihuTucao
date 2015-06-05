package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "t_class_info")
public class ClassInfo {
    @Id
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父类ID
     */
    private Integer parentid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态（0无效，1有效）
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
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父类ID
     *
     * @return parentid - 父类ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父类ID
     *
     * @param parentid 父类ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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
     * 获取状态（0无效，1有效）
     *
     * @return state - 状态（0无效，1有效）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（0无效，1有效）
     *
     * @param state 状态（0无效，1有效）
     */
    public void setState(Integer state) {
        this.state = state;
    }
}