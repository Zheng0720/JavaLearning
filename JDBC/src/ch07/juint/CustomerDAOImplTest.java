package ch07.juint;

import ch03.Customer;
import ch07.CustomerDAOImpl;
import org.junit.jupiter.api.Test;
import util.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ZhengXinchang
 * @create 2021-08-24-10:30
 */
class CustomerDAOImplTest {
    private CustomerDAOImpl dao = new CustomerDAOImpl();

    @Test
    void insert() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();

            Customer customer = new Customer(1, "郑鑫昌", "zhengxinchang@126.com", new Date(435432664527L));
            dao.insert(connection, customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void deleteById() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            dao.deleteById(connection, 22);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void update() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            Customer customer = new Customer(19, "郑鑫昌", "zhengxinchang@126.com", new Date(435432664527L));
            dao.update(connection, customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void getCustomerById() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            Customer customer = dao.getCustomerById(connection, 2);
            System.out.println(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void getAll() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnectionC3p0();
            List<Customer> all = dao.getAll(connection);
            for (Customer cust : all) {
                System.out.println(cust);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void getCount() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            Long count = dao.getCount(connection);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }

    @Test
    void getMaxBirth() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            java.util.Date maxBirth = dao.getMaxBirth(connection);
            System.out.println(maxBirth);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection, null);
        }
    }
}