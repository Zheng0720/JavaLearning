package ch08;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ZhengXinchang
 * @create 2021-08-24-14:03
 */
public class C3P0 {
    public static void main(String[] args) throws PropertyVetoException, SQLException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver"); //loads the jdbc driver
        cpds.setJdbcUrl("dbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai");
        cpds.setUser("root");
        cpds.setPassword("root");

        Connection connection = cpds.getConnection();
    }
}
