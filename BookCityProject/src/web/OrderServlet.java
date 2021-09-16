package web;

import pojo.Cart;
import pojo.User;
import service.OrderService;
import service.impl.OrderServiceImpl;
import test.JDBCUtilsTest;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-20:35
 */
public class OrderServlet extends BaseServlet {
    private OrderService orderService = new OrderServiceImpl();

    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先获取cart购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        //获取userId
        User user = (User) req.getSession().getAttribute("user");
        if (user == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }

        Integer id = user.getId();
        String orderId = orderService.creatOrder(cart, id);
        req.getSession().setAttribute("orderId", orderId);
//        req.getRequestDispatcher("/pages/cart/checkout.jsp").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/pages/cart/checkout.jsp");
    }
}
