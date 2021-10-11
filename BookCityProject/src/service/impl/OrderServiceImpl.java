package service.impl;

import dao.BookDao;
import dao.OrderDao;
import dao.OrderItemDao;
import dao.impl.BookDaoImpl;
import dao.impl.OrderDaoImpl;
import dao.impl.OrderItemDaoImpl;
import pojo.*;
import service.OrderService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-20:07
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public String creatOrder(Cart cart, Integer userId) {
        String orderId = System.currentTimeMillis() + "" + userId;
        double totalPrice = cart.getTotalPrice();
        Order order = new Order(orderId, new Date(), new BigDecimal(totalPrice), 0, userId);
        orderDao.saveOrder(order);

        //购物车中的商品项
        for (Map.Entry<Integer, CartItem> entry : cart.getCartItems().entrySet()) {
            CartItem cartItem = entry.getValue();
            OrderItem orderItem = new OrderItem(null, cartItem.getName(), cartItem.getCount(), new BigDecimal(cartItem.getPrice()), new BigDecimal(cartItem.getTotalPrice()), orderId);
            orderItemDao.saveOrderItem(orderItem);
            //更新库存和销量
            Book book = bookDao.queryBookById(cartItem.getId());
            book.setSales(book.getSales() + cartItem.getCount());
            book.setStock(book.getStock() - cartItem.getCount());
            bookDao.updateBook(book);
        }
        //清空购物车
        cart.clear();
        return orderId;
    }
}
