import ch1_IOC.Book;
import ch1_IOC.BookList;
import ch1_IOC.Order;
import ch1_IOC.User;
import ch1_IOC.bean.Emp;
import ch1_IOC.service.UserService;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-8:57
 */
public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        BookList book = context.getBean("book", BookList.class);
        System.out.println(book);
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Book myBean = context.getBean("myBean", Book.class);
        System.out.println(myBean);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        ch1_IOC_2.bean.Order orders = context.getBean("orders", ch1_IOC_2.bean.Order.class);
        System.out.println(orders);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        ch1_IOC_2.autowire.Emp emp = context.getBean("emp", ch1_IOC_2.autowire.Emp.class);
        System.out.println(emp);
    }
    @Test
    public void test8() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(dataSource);
        DruidDataSource dataSourceProperties = context.getBean("dataSourceProperties", DruidDataSource.class);
        System.out.println(dataSourceProperties);
    }
    @Test
    public void test9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ch2_IOC_Annotation/bean1.xml");
        ch2_IOC_Annotation.service.UserService userService = context.getBean("userService", ch2_IOC_Annotation.service.UserService.class);
        userService.add();
    }




}
