package com.babibeng.shimao.sun.schedule;

import com.babibeng.shimao.sun.service.WebContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by wei on 15/6/29.
 */
@Service
public class DailyZhihuTask {

    @Autowired
    WebContentService webContentService;

    /**
     * 每日更新知乎吐槽
     */
    @Scheduled(cron = "0 0 7 * * ?")
    public void execute() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) -1);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        webContentService.fetchDailyZhihuContent(format.format(calendar));
    }
}
