package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: dev_guo
 * @Date: 2023/4/12 16:22
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
