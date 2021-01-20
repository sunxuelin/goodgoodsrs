package com.sxl.goodgoodsrs.user.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LoginController {
    @NacosValue("${obj}")
    private String obj;
    @PostMapping("Login")
    public String Login(String account,String password){
        System.out.println(obj);
       return "小矮恰屁";

    }
}
