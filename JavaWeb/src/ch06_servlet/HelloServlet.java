package ch06_servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-03-9:46
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServlet程序的别名："+servletConfig.getServletName());
        //获取初始化参数
        System.out.println("初始化参数user的值是："+servletConfig.getInitParameter("username"));
        //获取servletContext对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 专门处理请求和响应
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet 访问了");
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        //获取请求的方式
        String method = httpServletRequest.getMethod();
        if("GET".equals(method)){
            System.out.println("get请求");
        }else if("POST".equals(method)){
            System.out.println("post请求");
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
