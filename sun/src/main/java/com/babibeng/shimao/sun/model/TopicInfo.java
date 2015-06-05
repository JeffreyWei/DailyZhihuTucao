package com.babibeng.shimao.sun.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_topic_info")
public class TopicInfo {
    @Id
    private Integer id;

    /**
     * 主题名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态（1正常，0无效）
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createtime;

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
     * 获取主题名称
     *
     * @return name - 主题名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置主题名称
     *
     * @param name 主题名称
     */
    public void setName(String name) {
        this.name = name;
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
}