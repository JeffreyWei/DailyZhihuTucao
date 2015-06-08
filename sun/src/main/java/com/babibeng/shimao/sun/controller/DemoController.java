package com.babibeng.shimao.sun.controller;

import com.babibeng.shimao.sun.model.CustomerInfo;
import com.babibeng.shimao.sun.service.CustomerService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by wei on 15/6/4.
 */
@Controller
public class DemoController {
    @Autowired
    CustomerService customerService;
    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value = {"/", "index.html"})
    public String index() {
        PageHelper.startPage(1, 10);
        customerService.getCustomerByID(1);
        logger.info("Processing trade with id: {} and symbol : {} ", 1, 2);
//        CustomerInfo customerInfo = new CustomerInfo();
//        customerInfo.setName("spring mvc");
//        customerService.insertCustomer(customerInfo);
        return "index";
    }
}

