package com.zheng.factory;

import com.zheng.dao.UserDao;
import com.zheng.dao.UserDaoImpl;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-11:41
 */
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
