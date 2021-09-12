package pojo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-12-9:29
 */
public class Cart {

//    private Integer totalCount;
//    private Integer totalPrice;
    private Map<Integer, CartItem> cartItems = new LinkedHashMap<>();

    public Integer getTotalCount() {
        Integer totalCount = 0;
        for (Map.Entry<Integer, CartItem> entry : cartItems.entrySet()) {
            totalCount += entry.getValue().getCount();
        }
        return totalCount;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Integer, CartItem> entry : cartItems.entrySet()) {
            totalPrice += entry.getValue().getTotalPrice();
        }
        return totalPrice;
    }

    public Map<Integer, CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Integer, CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalCount=" + this.getTotalCount() +
                ", totalPrice=" + this.getTotalPrice() +
                ", cartItems=" + cartItems +
                '}';
    }

    /**
     * 添加商品项
     *
     * @param cartItem
     */
    public void addItem(CartItem cartItem) {
        //先查看购物车中是否含有该商品
        CartItem item = cartItems.get(cartItem.getId());
        if (item == null) {
            //没添加过此商品
            cartItems.put(cartItem.getId(), cartItem);
        } else {
            //已经添加过
            item.setCount(item.getCount() + 1);
        }
    }

    /**
     * 删除商品项
     *
     * @param id
     */
    public void deleteItem(Integer id) {
        cartItems.remove(id);
    }

    /**
     * 清空购物车
     */
    public void clear() {
        cartItems.clear();
    }

    /**
     * 修改商品数量
     *
     * @param id
     * @param count
     */
    public void updateCount(Integer id, Integer count) {
        CartItem item = cartItems.get(id);
        if (item != null) {
            item.setCount(count);
        }
    }
}
