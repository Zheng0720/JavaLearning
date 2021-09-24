package com.zheng.dao;

import com.zheng.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-16-14:36
 */
public interface UserMapper {

    //根据id查询用于
    User getUserById(int id);

    //分页查询
    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowBounds();


}
