package ch10_cookieAndSession.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-11-15:55
 */
public class SessionServlet extends BaseServlet {

    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建和获取session会话对象
        HttpSession session = req.getSession();
        //判断是否是新创建出来的
        boolean isNew = session.isNew();
        //唯一标识
        String id = session.getId();
        resp.getWriter().write("id:" + id + "  isNew:" + isNew);
    }

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1", "value1");
    }

    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object key1 = req.getSession().getAttribute("key1");
        resp.getWriter().write((String) key1);
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("session默认的超时时长：" + maxInactiveInterval);
    }

    protected void Life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(3);
        int maxInactiveInterval = session.getMaxInactiveInterval();
        resp.getWriter().write("session默认的超时时长：" + maxInactiveInterval);
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        session.invalidate();//让session会话马上超时
        resp.getWriter().write("session已无效");
    }
}
