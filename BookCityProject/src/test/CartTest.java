package test;

import org.junit.Test;
import pojo.Cart;
import pojo.CartItem;

import static org.junit.Assert.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-12-9:52
 */
public class CartTest {

    @Test
    public void addItem() {
        Cart cart=new Cart();
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(2,"夜曲",1,100));
        System.out.println(cart);
    }

    @Test
    public void deleteItem() {
        Cart cart=new Cart();
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(2,"夜曲",1,100));
        cart.deleteItem(1);
        System.out.println(cart);
    }

    @Test
    public void clear() {
        Cart cart=new Cart();
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(2,"夜曲",1,100));
        cart.clear();
        System.out.println(cart);
    }

    @Test
    public void updateCount() {
        Cart cart=new Cart();
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(1,"七里香",1,1000));
        cart.addItem(new CartItem(2,"夜曲",1,100));
        cart.updateCount(1,10);
        System.out.println(cart);
    }
}