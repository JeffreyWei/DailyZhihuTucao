package com.babibeng.shimao.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wei on 15/6/4.
 */
@Controller
public class DemoController {
    @RequestMapping(value = {"/", "index.html"})
    public String index() {
        return "index";
    }
}

