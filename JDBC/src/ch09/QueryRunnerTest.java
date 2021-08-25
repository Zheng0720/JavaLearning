package ch09;

import ch03.Customer;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;
import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-08-25-9:26
 */
public class QueryRunnerTest {
    @Test
    public void testInsert() throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnectionDruid();
        String sql = "insert into customers (name, email, birth) values (?,?,?)";
        int i = queryRunner.update(connection, sql, "周杰伦", "jay@126.com", "1990-10-2");
        System.out.println(i);
    }

    @Test
    public void testQuery1() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select id,name,email,birth from customers where id=?";
            BeanHandler<Customer> handler = new BeanHandler<>(Customer.class);
            Customer customer = queryRunner.query(connection, sql, handler, 26);
            System.out.println(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    public void testQuery2() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select id,name,email,birth from customers";
            BeanListHandler<Customer> handler = new BeanListHandler<>(Customer.class);
            List<Customer> customer = queryRunner.query(connection, sql, handler);
            customer.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    public void testQuery3() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select id,name,email,birth from customers where id=?";
            MapHandler mapHandler = new MapHandler();
            Map<String, Object> customer = queryRunner.query(connection, sql, mapHandler, 26);
            System.out.println(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    public void testQuery4() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select id,name,email,birth from customers";
            MapListHandler mapListHandler = new MapListHandler();
            List<Map<String, Object>> customer = queryRunner.query(connection, sql, mapListHandler);
            customer.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    public void testQuery5() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select count(*) from customers";
            ScalarHandler scalarHandler = new ScalarHandler();
            Long count = (Long) queryRunner.query(connection, sql, scalarHandler);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    public void testQuery6() {
        Connection connection = null;
        try {
            QueryRunner queryRunner = new QueryRunner();

            connection = JDBCUtils.getConnectionDruid();
            String sql = "select id,name,email,birth from customers where id=?";
            ResultSetHandler<Customer> handler=new ResultSetHandler<Customer>() {
                @Override
                public Customer handle(ResultSet resultSet) throws SQLException {
                    return null;
                }
            };
            Customer customer = queryRunner.query(connection, sql, handler, 26);
            System.out.println(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }
}
