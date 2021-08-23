package ch03;

import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;

/**
 * 针对于customer表的查询操作
 * @author ZhengXinchang
 * @create 2021-08-22-21:00
 */
public class CustomerForQuery {
    @Test
    public void test1(){
        String sql="select id,name,birth,email from customers where id=?";
        Customer customer = queryForCustomers(sql, 13);
        String sql2 = "select name,email from customers where name = ?";
        Customer customer1 = queryForCustomers(sql2, "周杰伦");
        System.out.println(customer);
        System.out.println(customer1);

    }

    /**
     * 针对于customer表的通用的查询操作
     * @param sql
     * @param args
     * @return
     */
    public static Customer queryForCustomers(String sql, Object... args){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            resultSet = ps.executeQuery();
            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //通过ResultSetMetaData获取结果集中的列数
            int columnCount = metaData.getColumnCount();
            if (resultSet.next()) {
                Customer customer = new Customer();
                for (int i = 0; i < columnCount; i++) {
                    Object value = resultSet.getObject(i + 1);
                    //获取每个列的列名
                    String columnName = metaData.getColumnName(i + 1);
                    //给customer对象指定的某个属性，赋值为value
                    Field field = Customer.class.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(customer, value);
                }
                return customer;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, ps, resultSet);
        }
        return null;

    }

    @Test
    public void testQuery1() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select id,name,email,birth from customers where id=?";
            ps = connection.prepareStatement(sql);
            ps.setObject(1, 1);

            //执行,并返回结果集
            resultSet = ps.executeQuery();
            //处理结果集
            if (resultSet.next()) {//next():判断结果集的下一条是否有数据，如果有数据返回true,并指针下移；如果返回false,指针不会下移。
                //获取当前这条数据的各个字段值
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                Date date = resultSet.getDate(4);

                //方式一
                //            System.out.println("id="+id+"name="+name+"email"+email+"date="+date);
                //将数据封装为一个对象
                Customer customer = new Customer(id, name, email, date);
                System.out.println(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.closeResource(connection, ps, resultSet);
        }
    }
}
