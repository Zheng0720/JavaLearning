package test;

import org.junit.Test;
import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import static org.junit.Assert.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-14:36
 */
public class UserServiceImplTest {
    UserService userService=new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(null,"孙燕姿","a12121","zjl@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "孙燕姿", "A12121", "zjl@qq.com")));
    }

    @Test
    public void existUserName() {
        if(userService.existUserName("孙燕姿")){
            System.out.println("用户名已存在");
        }else{
            System.out.println("用户名可用");
        }
    }
}