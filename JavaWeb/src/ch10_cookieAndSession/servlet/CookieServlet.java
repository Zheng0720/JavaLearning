package ch10_cookieAndSession.servlet;

import ch10_cookieAndSession.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-11-9:24
 */
public class CookieServlet extends BaseServlet {

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //1.创建cookie
        Cookie cookie = new Cookie("key1", "value1");
        resp.addCookie(cookie);
        Cookie cookie2 = new Cookie("key2", "value2");
        resp.addCookie(cookie2);
        Cookie cookie3 = new Cookie("key3", "value3");
        //2.通知客户端保存cookie
        resp.addCookie(cookie3);
        resp.getWriter().write("cookie创建成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();

        Cookie key1 = CookieUtils.findCookie("key1", cookies);
        resp.getWriter().write("key1的cookie值为：" + key1.getValue());
    }

    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        方案一:
//        1.先创建一个要修改的同名的Cookie对象
//        2.在构造器同时赋于新的Cookie值
//        resp.setContentType("text/html;charset=utf-8");
//        Cookie cookie = new Cookie("key1", "value123");
////        3.调用response.addcookie(cookie);
//        resp.addCookie(cookie);
//        resp.getWriter().write("key1的cookie已经修改好");

//        方案二:
//        1、先查找到需要修改的 Cookie对象
        Cookie key1 = CookieUtils.findCookie("key1", req.getCookies());
        if (key1 != null) {
//        2、调用setValue()方法赋于新的Cookie值
            key1.setValue("newValue1");
//        3、调用response.addCookie()通知客户端保存修改。
            resp.addCookie(key1);

        }
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife", "defaultLife");
        cookie.setMaxAge(-1);//设置存活时间
        resp.addCookie(cookie);

    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie key1 = CookieUtils.findCookie("key1", req.getCookies());
        if (key1 != null) {
            key1.setMaxAge(0);
            resp.addCookie(key1);
        }
    }
    protected void defaultLife3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife3600", "defaultLife3600");
        cookie.setMaxAge(3600);//设置存活时间
        resp.addCookie(cookie);
    }

    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1", "path1");
        cookie.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie);
    }
}
