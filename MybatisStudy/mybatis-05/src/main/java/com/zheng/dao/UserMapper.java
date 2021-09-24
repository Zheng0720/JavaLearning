package com.zheng.dao;


import com.zheng.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-16-14:36
 */
public interface UserMapper {

    @Select("select id,name,pwd password from user")
    List<User> getUsers();

    @Select("select id,name,pwd password from user where id=#{id} and name=#{name}")
    User getUserById(@Param("id") int id, @Param("name") String name);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
