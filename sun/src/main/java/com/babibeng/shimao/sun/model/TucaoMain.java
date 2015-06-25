package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "T_TUCAO_MAIN")
public class TucaoMain {
    @Id
    private Integer id;

    public TucaoMain() {
    }

    /**
     * 知乎日报日期
     */
    private String dateid;

    /**
     * 是否已下载 0未下载1已下载
     */
    private Integer downloaded;

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
     * 获取知乎日报日期
     *
     * @return dateid - 知乎日报日期
     */
    public String getDateid() {
        return dateid;
    }

    /**
     * 设置知乎日报日期
     *
     * @param dateid 知乎日报日期
     */
    public void setDateid(String dateid) {
        this.dateid = dateid;
    }

    /**
     * 获取是否已下载 0未下载1已下载
     *
     * @return downloaded - 是否已下载 0未下载1已下载
     */
    public Integer getDownloaded() {
        return downloaded;
    }

    /**
     * 设置是否已下载 0未下载1已下载
     *
     * @param downloaded 是否已下载 0未下载1已下载
     */
    public void setDownloaded(Integer downloaded) {
        this.downloaded = downloaded;
    }

    public TucaoMain(Integer id, String dateid) {
        this.id = id;
        this.dateid = dateid;
    }
}