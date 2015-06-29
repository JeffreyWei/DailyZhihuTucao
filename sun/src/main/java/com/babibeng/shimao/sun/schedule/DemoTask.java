package com.babibeng.shimao.sun.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by wei on 15/6/4.
 */
@Service
public class DemoTask {
//    @Scheduled(cron = "0/2 * * * * *")
    public void execute() {
        System.out.println(new Date());
    }
}
