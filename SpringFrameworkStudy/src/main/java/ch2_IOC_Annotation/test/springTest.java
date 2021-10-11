package ch2_IOC_Annotation.test;


import ch2_IOC_Annotation.config.SpringConfig;
import ch2_IOC_Annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-11:16
 */
public class springTest {
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ch2_IOC_Annotation/bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }
    @Test
    public void test2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }


}
