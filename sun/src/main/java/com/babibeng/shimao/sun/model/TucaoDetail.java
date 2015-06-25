package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "T_TUCAO_DETAIL")
public class TucaoDetail {
    @Id
    private Integer id;

    public TucaoDetail(Integer mainid, String title, String content, String link) {
        this.mainid = mainid;
        this.title = title;
        this.content = content;
        this.link = link;
    }

    public TucaoDetail() {
    }

    /**
     * 关联吐槽ID
     */
    private Integer mainid;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 知乎连接
     */
    private String link;

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
     * 获取关联吐槽ID
     *
     * @return mainid - 关联吐槽ID
     */
    public Integer getMainid() {
        return mainid;
    }

    /**
     * 设置关联吐槽ID
     *
     * @param mainid 关联吐槽ID
     */
    public void setMainid(Integer mainid) {
        this.mainid = mainid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取知乎连接
     *
     * @return link - 知乎连接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置知乎连接
     *
     * @param link 知乎连接
     */
    public void setLink(String link) {
        this.link = link;
    }
}