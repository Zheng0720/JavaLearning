package spring_ioc_ano.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_ioc_ano.service.UserService;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-16:40
 */
public class UserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_ioc_ano.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.save();
        context.close();
    }
}
