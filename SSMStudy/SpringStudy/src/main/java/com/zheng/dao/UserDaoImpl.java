package com.zheng.dao;

import com.zheng.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-11:17
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List StrList;
    private Map<String, User> map;
    private Properties properties;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    public void setProperties(Properties properties){
        this.properties=properties;
    }
    public void setStrList(List strList){
        this.StrList=strList;
    }

    @Override
    public void save() {
        System.out.println(StrList);
        System.out.println(map);
        System.out.println(properties);
        System.out.println("userDaoImpl save方法,username:" + username + " age:" + age);
    }


    public void init() {
        System.out.println("初始化方法");
    }

    public void destroy() {
        System.out.println("销毁方法");
    }

}
