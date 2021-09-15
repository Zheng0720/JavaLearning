package service;

import pojo.Cart;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-20:06
 */
public interface OrderService {
    public String creatOrder(Cart cart, Integer userId);
}
