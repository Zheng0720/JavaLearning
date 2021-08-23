package ch03;

import ch02.ConnectionTest;
import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * 使用PreparedStatement来替换Statement,实现对数据表的增删改操作
 * 增删改；查
 *
 * @author ZhengXinchang
 * @create 2021-08-22-17:04
 */
public class preparedStatementUpdateTest {

    @Test
    public void test() {

//       String sql = "delete from customers where id = ?";
//		update(sql,3);
        String sql = "update `order` set order_name=? where order_id=?";
        update(sql, "DD", 2);
    }

    //通用的增删改操作
    public void update(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, ps);
        }
    }


    //修改customers表的一条记录
    @Test
    public void testUpdate() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库的连接
            connection = JDBCUtils.getConnection();
            //2.预编译sql语句，返回preparedStatement实例
            String sql = "update customers set name=? where id=?;";
            ps = connection.prepareStatement(sql);
            //3.填充占位符
            ps.setString(1, "莫扎特");
            ps.setInt(2, 18);
            //4.执行
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.资源的关闭
            JDBCUtils.closeResource(connection, ps);
        }

    }


    //向customer表中添加一条数据
    @Test
    public void testInsert() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1.读取配置文件中的基本信息
            InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(is);

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("driverClass");

            //2.加载驱动
            Class.forName(driverClass);
            //3.获取连接
            connection = DriverManager.getConnection(url, user, password);

            //4.预编译sql语句，返回PreparedStatement的实例
            String sql = "insert into customers(name,email,birth)values(?,?,?)";//?:占位符
            ps = connection.prepareStatement(sql);

            //5.填充占位符
            ps.setString(1, "哪吒");
            ps.setString(2, "neza@gmail.com");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = simpleDateFormat.parse("1000-01-01");
            ps.setDate(3, new Date(date.getTime()));

            //6.执行sql
            ps.execute();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            //7.资源的关闭
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
    }
}
