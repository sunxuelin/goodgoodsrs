package com.sxl.goodgoodsrs.user.controller;

import com.sxl.goodgoodsrs.api.model.User;
import com.sxl.goodgoodsrs.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        User user = new User();
        user.setAccount("admin");
        user.setPassword("12345678");
        userService.insertUser(user);
        System.out.println("hello");
       return "123";
    }
}
