package test;


import dao.impl.UserDaoImpl;
import org.junit.Test;
import pojo.User;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-11:29
 */
public class UserDaoTest {
    UserDaoImpl userDao = new UserDaoImpl();

    @Test
    public void queryUserByUserName() {
        System.out.println(userDao.queryUserByUserName("郑鑫昌"));
    }

    @Test
    public void savaUser() {
        System.out.println(userDao.savaUser(new User(null,"郑鑫昌", "1234", "lsn@qq.coom")));
    }

    @Test
    public void queryUserByUserNameAndPassword() {
        if (userDao.queryUserByUserNameAndPassword("郑鑫昌", "1123") == null) {
            System.out.println("登录失败");
        } else {
            System.out.println("登录成功");
        }
    }
}