package ch08;


import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ZhengXinchang
 * @create 2021-08-24-18:00
 */
public class DBCPTest {
    //方式一
    @Test
    public void testGetConnection() throws SQLException {
        //创建DBCP数据库连接池
        BasicDataSource source = new BasicDataSource();

        //设置基本信息
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/test?rewriteBatchedStatements=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false");
        source.setUsername("root");
        source.setPassword("root");

        //还可以设置其他涉及数据库连接池管理的相关属性:
        source.setInitialSize(10);
        source.setMaxActive(10);

        Connection connection = source.getConnection();
        System.out.println(connection);
    }
    //方式二：使用配置文件
    @Test
    public void testGetConnection2() throws Exception {
        Properties pros = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("dbcp.properties");
        pros.load(is);
        DataSource dataSource = BasicDataSourceFactory.createDataSource(pros);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }
}
