package ch06;

import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author ZhengXinchang
 * @create 2021-08-23-16:38
 */
public class TransactionTest {

    //用户AA向用户BB转账100
    @Test
    public void testUpdate() {
        String sql1 = "update user_table set balance=balance-100 where user=?";
        update(sql1, "AA");
        String sql2 = "update user_table set balance=balance+100 where user=?";
        update(sql2, "BB");
        System.out.println("转账成功");
    }


    /**
     * 通用的增删改操作，为考虑数据库事务
     *
     * @param sql
     * @param args
     * @return
     */
    public int update(String sql, Object... args) {

        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, ps);
        }
        return 0;
    }


    //************************考虑事务***********************
    @Test
    public void testUpdateWithTX() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            //取消数据的自动提交
            connection.setAutoCommit(false);
            String sql1 = "update user_table set balance=balance-100 where user=?";
            update(connection, sql1, "AA");

            //模拟网络异常
            System.out.println(10 / 0);
            String sql2 = "update user_table set balance=balance+100 where user=?";
            update(connection, sql2, "BB");
            System.out.println("转账成功");
            //提交数据
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    /**
     * 通用的增删改操作，需要考虑数据库事务
     *
     * @param sql
     * @param args
     * @return
     */
    public int update(Connection connection, String sql, Object... args) {

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(null, ps);
        }
        return 0;
    }

    //******************隔离级别****************
    @Test
    public void testTransactionSelect() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = JDBCUtils.getConnection();
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        //取消自动提交
        connection.setAutoCommit(false);
        String sql = "select user,password,balance from user_table where user=?";
        User user = getInstance(connection, User.class, sql, "CC");
        System.out.println(user);


    }

    @Test
    public void testTransactionUpdate() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        Connection connection = JDBCUtils.getConnection();
        //取消自动提交
        connection.setAutoCommit(false);
        String sql = "update user_table set balance=? where user=?";
        update(connection,sql,5000,"CC");

        Thread.sleep(5000);
        System.out.println("修改结束");
//        connection.commit();
    }

    //考虑事务的查询操作
    public <T> T getInstance(Connection connection, Class<T> clazz, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            //执行，获取结果集
            resultSet = ps.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取列数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取每个列的值
                    Object value = resultSet.getObject(i + 1);
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //通过反射，将对象指定的columnName的属性赋值为指定的value
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, value);
                }
                return t;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(null, ps, resultSet);
        }
        return null;
    }
}
