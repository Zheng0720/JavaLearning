package spring_ioc_ano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring_ioc_ano.dao.UserDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


/**
 * @author ZhengXinchang
 * @create 2021-10-05-16:35
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("service对象的初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("service对象的销毁方法");
    }
}
