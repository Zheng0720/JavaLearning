package ch07_servlet2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-15:19
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在servlet1中的username：" + username);

        req.setAttribute("key", "servlet1 的章");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        requestDispatcher.forward(req, resp);

    }
}
