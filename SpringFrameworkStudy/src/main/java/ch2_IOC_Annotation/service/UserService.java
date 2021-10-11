package ch2_IOC_Annotation.service;

import ch2_IOC_Annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-11:12
 */

@Service(value = "userService")
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    public void add() {
        System.out.println("service add.....");
        userDao.add();
    }
}
