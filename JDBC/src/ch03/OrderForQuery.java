package ch03;

import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;

/**
 * 针对order的通用查询操作
 *
 * @author ZhengXinchang
 * @create 2021-08-23-9:18
 */
public class OrderForQuery {
    /*
     * 针对于表的字段名与类的属性名不相同的情况：
     * 1. 必须声明sql时，使用类的属性名来命名字段的别名
     * 2. 使用ResultSetMetaData时，需要使用getColumnLabel()来替换getColumnName(),获取列的别名。
     *  说明：如果sql中没有给字段其别名，getColumnLabel()获取的就是列名
     */
   @Test
   public void test1(){
       String sql="select order_id orderId,order_name orderName,order_date orderDate from `order` where order_id=?";
       Order order = OrderForQuery(sql, 1);
       System.out.println(order);
   }



    public Order OrderForQuery(String sql, Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
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
                Order order = new Order();
                for (int i = 0; i < columnCount; i++) {
                    //获取每个列的值
                    Object value = resultSet.getObject(i + 1);
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //通过反射，将对象指定的columnName的属性赋值为指定的value
                    Field field = Order.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(order, value);
                }
                return order;
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
}
