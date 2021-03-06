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

    //根据id查询用于
    User getUserById(int id);

    //增加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
