package com.sxl.goodgoodsrs.api.model;

import com.sxl.goodgoodsrs.common.model.CommonModel;
import lombok.*;

@Data
@Setter
@Getter
/**
 * 用户model
 */
public class User extends CommonModel {
    //账户
    private String account;
    //密码
    private String password;
    //盐
    private String salt;
    //地址
    private String address;
    //电话
    private String iphone;
    //上次登录时间
    private String lastSignUpTime;
    //头像地址
    private String avatarUrl;
    //0 启动 1 禁用
    private Integer lock;

}
