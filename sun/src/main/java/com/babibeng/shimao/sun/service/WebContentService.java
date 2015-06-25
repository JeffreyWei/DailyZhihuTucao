package com.babibeng.shimao.sun.service;

/**
 * Created by wei on 15/6/23.
 */
public interface WebContentService {
    /**
     *
     * @param dateStr   {dateStr}的数字应为 20131119
     * @return
     */
    public boolean getDailyZhihuContent(String dateStr);
}
