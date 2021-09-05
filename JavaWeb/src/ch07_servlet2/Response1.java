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
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游，response1");
        //设置响应状态码
        resp.setStatus(302);
        //设置新地址
        resp.setHeader("Location","http://localhost:8080/JavaWeb_war_exploded/response2");
    }
}
