package com.sxl.goodgoodsrs.user.service;

import com.sxl.goodgoodsrs.api.model.User;
import com.sxl.goodgoodsrs.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


}
