package ch07_servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-9:34
 */
public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置服务器字符集为UTF-8
        resp.setCharacterEncoding("UTF-8");
        // 通过响应头,设置浏览器也使用UTF-8 字符集
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
        resp.getWriter().write("曾到此一游，response2");
    }
}
