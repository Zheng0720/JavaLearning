package ch08;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ZhengXinchang
 * @create 2021-08-24-12:24
 */
public class C3P0Test {
    //方式一
    @Test
    public void testGetConnection() throws PropertyVetoException, SQLException {

        //获取c3p0数据库连接池
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver"); //loads the jdbc driver
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test?rewriteBatchedStatements=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false");

        cpds.setUser("root");
        cpds.setPassword("root");

        //通过设置相关的参数，对数据库的连接池进行管理
        //设置初始时数据库连接池中的连接数
        cpds.setInitialPoolSize(10);

        Connection connection = cpds.getConnection();
        System.out.println(connection);
        //销毁数据库连接池
        DataSources.destroy(cpds);
    }

    //方式二：配置文件
    @Test
    public void testGetConnection1() throws SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");
        Connection connection = cpds.getConnection();
        System.out.println(connection);

    }
}
