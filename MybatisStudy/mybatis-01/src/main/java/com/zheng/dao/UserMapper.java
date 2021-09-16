package com.zheng.dao;

import com.zheng.pojo.User;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-16-14:36
 */
public interface UserMapper {


    //获取用户列表
    List<User> getUserList();
}
