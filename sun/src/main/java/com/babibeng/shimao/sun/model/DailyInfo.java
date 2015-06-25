package com.babibeng.shimao.sun.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 15/6/23.
 */
public class DailyInfo {
    private String date;
    private List<DailyStoryInfo> stories=new ArrayList<DailyStoryInfo>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DailyStoryInfo> getStories() {
        return stories;
    }

    public void setStories(List<DailyStoryInfo> stories) {
        this.stories = stories;
    }
}
