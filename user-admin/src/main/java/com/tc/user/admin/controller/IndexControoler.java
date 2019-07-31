package com.tc.user.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zangzh
 * @date 2019/7/31 10:01
 */
@Controller
@RequestMapping("/")
public class IndexControoler {
    @RequestMapping
    public String login() {
        return "login";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}

