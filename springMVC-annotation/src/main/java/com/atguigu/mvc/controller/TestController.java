package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2023/4/10
 * Author:devguo
 * Description:
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
