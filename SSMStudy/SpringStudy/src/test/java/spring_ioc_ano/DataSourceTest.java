package spring_ioc_ano;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import spring_ioc_ano.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_ioc_ano.config.SpringConfiguration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-15:58
 */
public class DataSourceTest {
    @Test
    //创建c3p0数据源
    public void test1() throws SQLException, PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/book?rewriteBatchedStatements=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false";
        dataSource.setJdbcUrl(url);
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //创建的druid数据源
    public void test2() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/book?rewriteBatchedStatements=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false";
        dataSource.setUrl(url);
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //创建的druid数据源
    public void test3() throws SQLException, IOException {

        Properties properties = new Properties();
        InputStream in=DataSourceTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(in);

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getProperty("driverClassName"));
        dataSource.setUrl(properties.getProperty("url"));
        dataSource.setUsername(properties.getProperty("username"));
        dataSource.setPassword(properties.getProperty("password"));
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test4() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("DataSource.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void test5() throws SQLException {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.save();
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
