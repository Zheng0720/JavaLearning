package dao.impl;

import dao.OrderItemDao;
import pojo.OrderItem;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-19:49
 */
public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql="insert into order_item_table( name, count, price, total_price, order_id) value(?,?,?,?,?)";
        return update(sql,orderItem.getCount(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }
}
