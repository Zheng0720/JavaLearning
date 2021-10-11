package ch3_AOP.test;

import ch3_AOP.AOPAnnotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-10-04-9:53
 */
public class AOPTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch3_AOP/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
