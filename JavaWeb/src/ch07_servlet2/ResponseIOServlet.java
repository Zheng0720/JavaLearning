package ch07_servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ZhengXinchang
 * @create 2021-09-04-16:22
 */
public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置服务器字符集为UTF-8
        resp.setCharacterEncoding("UTF-8");
        // 通过响应头,设置浏览器也使用UTF-8 字符集
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.write("天津大学机械工程学院");
    }
}
