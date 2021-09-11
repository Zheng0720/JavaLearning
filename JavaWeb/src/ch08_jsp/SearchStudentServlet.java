package ch08_jsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-06-21:30
 */
public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        //发sql语句查询学生的信息
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int t = i + 1;
            studentList.add(new Student(t, "name" + t, 18 + t, "phone" + t));
        }
        //保存查询到的结果到request域中
        req.setAttribute("studentList", studentList);
        //请求转发到jsp页面中
        req.getRequestDispatcher("/test/test2.jsp").forward(req, resp);
    }
}
