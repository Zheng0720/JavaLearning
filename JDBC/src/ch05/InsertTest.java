package ch05;

import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用PreparedStatement实现批量数据的操作
 *
 * @author ZhengXinchang
 * @create 2021-08-23-15:11
 */
public class InsertTest {
    //方式二
    @Test
    public void testInsert1() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();

            String sql = "insert into goods(name) values(?)";
            ps = connection.prepareStatement(sql);
            for (int i = 1; i <= 20000; i++) {
                ps.setObject(1, "name_" + i);
                ps.execute();
            }
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
    //方式三

    /**
     * 修改1： 使用 addBatch() / executeBatch() / clearBatch()
     * 修改2：mysql服务器默认是关闭批处理的，我们需要通过一个参数，让mysql开启批处理的支持。
     * ?rewriteBatchedStatements=true 写在配置文件的url后面
     * 修改3：使用更新的mysql 驱动：mysql-connector-java-5.1.37-bin.jar
     */
    @Test
    public void testInsert2() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();

            String sql = "insert into goods(name) values(?)";
            ps = connection.prepareStatement(sql);
            for (int i = 1; i <= 1000000; i++) {
                ps.setObject(1, "name_" + i);
                //1."攒"
                ps.addBatch();
                if (i % 500 == 0) {
                    //2.执行
                    ps.executeBatch();
                    //2.清空
                    ps.clearBatch();
                }
            }
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

    //最终方案
    @Test
    public void testInsert3() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            //设置不允许自动提交数据
            connection.setAutoCommit(false);
            String sql = "insert into goods(name) values(?)";
            ps = connection.prepareStatement(sql);
            for (int i = 1; i <= 1000000; i++) {
                ps.setObject(1, "name_" + i);
                //1."攒"
                ps.addBatch();
                if (i % 500 == 0) {
                    //2.执行
                    ps.executeBatch();
                    //2.清空
                    ps.clearBatch();
                }
            }
            connection.commit();
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

}
