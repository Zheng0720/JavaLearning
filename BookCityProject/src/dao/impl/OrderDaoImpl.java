package dao.impl;

import dao.OrderDao;
import pojo.Order;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-19:49
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql="insert into order_table(order_id, creat_time, price, status, user_id) value (?,?,?,?,?)";
        return update(sql, order.getOrder_id(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }
}
