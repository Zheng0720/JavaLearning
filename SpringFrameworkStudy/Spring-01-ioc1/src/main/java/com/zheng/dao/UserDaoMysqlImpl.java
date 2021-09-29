package com.zheng.dao;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-16:28
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据");
    }
}
