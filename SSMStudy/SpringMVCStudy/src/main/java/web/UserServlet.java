package web;


import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author ZhengXinchang
 * @create 2021-10-06-10:02
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
//        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = context.getBean("userService", UserService.class);
        userService.save();
    }
}
