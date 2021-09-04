package ch06_servlet; /**
 * @author ZhengXinchang
 * @create 2021-09-03-17:09
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取web.xml中配置的上下文参数context-param
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        String password = servletContext.getInitParameter("password");
        System.out.println("username的值是："+username);
        System.out.println("password的值是："+password);
        // 2.获取当前的工程路径,格式:/工程路径
        System.out.println("当前工作路径："+servletContext.getContextPath());
        // 3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("当前绝对路径："+servletContext.getRealPath("/"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
