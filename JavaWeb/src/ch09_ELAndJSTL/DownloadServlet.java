package ch09_ELAndJSTL;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author ZhengXinchang
 * @create 2021-09-08-15:13
 */
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、获取要下载的文件名.
        String downloadFileName = "2.jpg";
//        2、读取要下载的文件内容
        ServletContext servletContext = getServletContext();
        //获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/file/" + downloadFileName);
        System.out.println("下载的文件类型：" + mimeType);
//        4、在回传前,通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
//        5、还要告诉客户端收到的数据是用于下载使用(还是使用响应头)
        resp.setHeader("Content-Disposition","attachment;filename="+downloadFileName);

        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        //获取相应的输出流
        OutputStream outputStream = resp.getOutputStream();
//        3、把下载的文件内容回传给客户端
        IOUtils.copy(resourceAsStream, outputStream);


    }
}
