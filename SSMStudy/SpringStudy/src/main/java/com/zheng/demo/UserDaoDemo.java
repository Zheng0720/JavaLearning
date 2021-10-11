package com.zheng.demo;

import com.zheng.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-11:19
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.save();
        System.out.println(userDao);
    }
}
