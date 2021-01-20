package com.sxl.goodgoodsrs.user.service;

import com.sxl.goodgoodsrs.api.model.User;
import com.sxl.goodgoodsrs.common.dao.CommonDao;
import com.sxl.goodgoodsrs.user.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService extends CommonDao {
    @Resource
    private UserMapper userMapper;

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


}
