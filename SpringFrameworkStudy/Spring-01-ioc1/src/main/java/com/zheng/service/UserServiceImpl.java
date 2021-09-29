package com.zheng.service;

import com.zheng.dao.UserDao;
import com.zheng.dao.UserDaoImpl;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-16:29
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
