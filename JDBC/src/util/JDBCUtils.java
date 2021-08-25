package util;


import ch02.ConnectionTest;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 操作数据库的工具类
 *
 * @author ZhengXinchang
 * @create 2021-08-22-17:25
 */
public class JDBCUtils {
    /**
     * 获取数据库的连接
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        //1.读取配置文件中的基本信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");

        //2.加载驱动
        Class.forName(driverClass);
        //3.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    /**
     * 使用c3p0数据库连接池获取连接
     *
     * @return
     * @throws SQLException
     */
    private static ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");

    public static Connection getConnectionC3p0() throws SQLException {
        Connection connection = cpds.getConnection();
        return connection;
    }

    /**
     * 使用DBCP数据库连接池获取连接
     *
     * @return
     * @throws Exception
     */
    private static DataSource dataSource;
    static {
        try {
            Properties pros = new Properties();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("dbcp.properties");
            pros.load(is);
            dataSource = BasicDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnectionDBCP() throws Exception {


        Connection connection = dataSource.getConnection();
        return connection;
    }

    /**
     * 关闭资源的操作
     *
     * @param connection
     * @param ps
     */
    public static void closeResource(Connection connection, Statement ps) {
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭资源
     *
     * @param connection
     * @param ps
     * @param resultSet
     */
    public static void closeResource(Connection connection, Statement ps, ResultSet resultSet) {
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (resultSet != null)
                resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
