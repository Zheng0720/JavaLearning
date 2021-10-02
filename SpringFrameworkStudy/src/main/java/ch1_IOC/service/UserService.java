package ch1_IOC.service;

import ch1_IOC.User;
import ch1_IOC.dao.UserDao;
import ch1_IOC.dao.UserDaoImpl;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-10:59
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...........");
        userDao.update();
    }
}
