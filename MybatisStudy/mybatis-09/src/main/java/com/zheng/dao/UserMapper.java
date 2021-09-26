package com.zheng.dao;

import com.zheng.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-10:52
 */
public interface UserMapper {

    //查询用户
    User queryUserById(@Param("id") int id);

    //修改用户
    int updateUser(User user);
}
