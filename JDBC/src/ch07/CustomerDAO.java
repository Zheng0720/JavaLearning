package ch07;

import ch03.Customer;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

/**
 * 此接口用于规范对于customer表的常用操作
 *
 * @author ZhengXinchang
 * @create 2021-08-24-9:13
 */
public interface CustomerDAO {
    /**
     * 将customer对象添加到数据库中
     * @param connection
     * @param customer
     */
    void insert(Connection connection, Customer customer);

    /**
     * 根据指定id删除表中的记录
     * @param connection
     * @param id
     */
    void deleteById(Connection connection,int id);

    /**
     * 针对内存中的customer对象，去修改数据表中的指定记录
     * @param connection
     * @param customer
     */
    void update(Connection connection,Customer customer);

    /**
     * 根据指定的id查询得到对应的customer对象
     * @param connection
     * @param id
     */
    Customer getCustomerById(Connection connection,int id);

    /**
     * 查询表中所有的记录
     * @param connection
     * @return
     */
    List<Customer> getAll(Connection connection);

    /**
     * 返回表中的数据条目数
     * @param connection
     * @return
     */
    Long getCount(Connection connection);

    /**
     * 返回数据表中最大的生日
     * @param connection
     * @return
     */
    Date getMaxBirth(Connection connection);
}
