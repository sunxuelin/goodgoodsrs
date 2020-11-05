package com.sxl.goodgoodsrs.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("Login")
    public String Login(String account,String password){
       return "小矮恰屁";

    }
}
