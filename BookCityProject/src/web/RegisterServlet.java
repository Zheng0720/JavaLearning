package web;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-05-14:51
 */
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //验证码
        if ("abcde".equalsIgnoreCase(code)) {
            //检查用户名是否可用
            if (userService.existUserName(username)) {//不可用
                System.out.println("用户名[" + username + "]不可用，已存在");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {  //可用
                User user = new User(null, username, password, email);
                userService.registerUser(user);
                //跳到注册成功页面
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
            }

        } else {
            System.out.println("验证码[" + code + "]错误 ");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
