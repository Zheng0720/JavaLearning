package ch07_servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-15:19
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在servlet2中的username：" + username);

        Object key = req.getAttribute("key");
        System.out.println("柜台1是否有章："+key);

        System.out.println("处理自己的业务");
    }
}
