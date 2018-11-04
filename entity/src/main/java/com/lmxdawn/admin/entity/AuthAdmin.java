package com.lmxdawn.admin.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AuthAdmin {
    
    // 主键
    private Long id;
    // 昵称
    private String username;
    // 登录密码
    private String password;
    // 手机号
    private String tel;
    // 邮箱
    private String email;
    // 头像
    private String avatar;
    // 性别
    private Integer sex;
    // 最后登录ip
    private String last_login_ip;
    // 最后登录时间
    private Date last_login_time;
    // 创建时间
    private Date create_time;
    // 状态
    private Integer status;
    
}
