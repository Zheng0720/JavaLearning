package service.Impl;

import dao.UserDao;
import service.UserService;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-9:52
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
