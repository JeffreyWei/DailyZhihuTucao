package com.babibeng.shimao.sun.model;

import javax.persistence.*;

@Table(name = "t_goods_images")
public class GoodsImages {
    @Id
    private Integer id;

    /**
     * 商品ID
     */
    private Integer goodsid;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 文件存储路径
     */
    private String filepath;

    /**
     * 图片跳转地址
     */
    private String linkpath;

    /**
     * 状态（1正常，0无效）
     */
    private Integer state;

    /**
     * 图片显示顺序
     */
    private Integer index;

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
     * 获取文件名称
     *
     * @return filename - 文件名称
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称
     *
     * @param filename 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取文件存储路径
     *
     * @return filepath - 文件存储路径
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置文件存储路径
     *
     * @param filepath 文件存储路径
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * 获取图片跳转地址
     *
     * @return linkpath - 图片跳转地址
     */
    public String getLinkpath() {
        return linkpath;
    }

    /**
     * 设置图片跳转地址
     *
     * @param linkpath 图片跳转地址
     */
    public void setLinkpath(String linkpath) {
        this.linkpath = linkpath;
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
     * 获取图片显示顺序
     *
     * @return index - 图片显示顺序
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 设置图片显示顺序
     *
     * @param index 图片显示顺序
     */
    public void setIndex(Integer index) {
        this.index = index;
    }
}