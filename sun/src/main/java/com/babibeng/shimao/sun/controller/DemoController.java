package com.babibeng.shimao.sun.controller;

import com.babibeng.shimao.sun.service.CustomerService;
import com.babibeng.shimao.sun.service.WebContentService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by wei on 15/6/4.
 */
@Controller
public class DemoController {
    @Autowired
    CustomerService customerService;
    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    WebContentService webContentService;

    @RequestMapping(value = {"/", "index.html"})
    public String index() {
        PageHelper.startPage(1, 10);
//        customerService.getCustomerByID(1);
        logger.info("Processing trade with id: {} and symbol : {} ", 1, 2);
//        CustomerInfo customerInfo = new CustomerInfo();
//        customerInfo.setName("spring mvc");
//        customerService.insertCustomer(customerInfo);


//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Calendar start = Calendar.getInstance();
//                start.set(2013, 5, 20);
//                Calendar end = Calendar.getInstance();
//                end.set(2015, 6, 23);
//                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//                while(start.compareTo(end) <= 0) {
//                    String dateStr=format.format(end.getTime());
//                    System.out.println(dateStr+" result:"+webContentService.fetchDailyZhihuContent(dateStr));
//                    //循环，每次天数加1
//                    end.set(Calendar.DATE, end.get(Calendar.DATE) -1);
//                }
//            }
//        });
//        t.start();
        return "index";
    }
}

