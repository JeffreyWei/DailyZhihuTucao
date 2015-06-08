package com.babibeng.shimao.sun.util;

import com.github.sd4324530.fastweixin.api.config.ApiConfig;

/**
 * Created by wei on 15/6/8.
 */
public class WeChartConfig {
    private String appID;
    private String appsecret;
    private ApiConfig config;

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public ApiConfig getWeCharApiConfig() {
        if (config == null) {
            synchronized (this) {
                if (config == null) {
                    config = new ApiConfig(this.appID, this.appsecret);
                }
            }
        }
        return config;
    }
}
