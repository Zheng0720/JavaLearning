package web;

import pojo.Book;
import pojo.Page;
import service.BookService;
import service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhengXinchang
 * @create 2021-09-10-20:04
 */
public class ClientBookServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    /**
     * 处理分页功能
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.获取请求的参数pageNo和pageSize
        String pageNoString = req.getParameter("pageNo");
        int pageNo = pageNoString == null ? 1 : Integer.parseInt(pageNoString);
        String pageSizeString = req.getParameter("pageSize");
        int pageSize = (pageSizeString == null ? Page.PAGE_SIZE : Integer.parseInt(pageNoString));
        //2.调用BookService方法(page)
        Page<Book> page = bookService.page(pageNo, pageSize);
        page.setUrl("client/bookServlet?action=page");
        //3.保存到page对象到request域中
        req.setAttribute("page", page);
        //4.请求转发
        req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
    }

    protected void pageByPrice(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.获取请求的参数pageNo和pageSize
        String pageNoString = req.getParameter("pageNo");

        int pageNo = pageNoString == null ? 1 : Integer.parseInt(pageNoString);

        String pageSizeString = req.getParameter("pageSize");
        int pageSize = (pageSizeString == null ? Page.PAGE_SIZE : Integer.parseInt(pageNoString));

        String minString = req.getParameter("min");
        int min = (minString == null ? 0 : Integer.parseInt(minString));

        String maxString = req.getParameter("max");
        int max = (maxString == null ? Integer.MAX_VALUE : Integer.parseInt(maxString));

        //2.调用BookService方法(page)
        Page<Book> page = bookService.pageByPrice(pageNo, pageSize, min, max);

        StringBuilder sb = new StringBuilder("client/bookServlet?action=pageByPrice");
        if (req.getParameter("min") != null) {
            sb.append("&min=").append(req.getParameter("min"));
        }

        if (req.getParameter("max") != null) {
            sb.append("&max=").append(req.getParameter("max"));
        }
        page.setUrl(sb.toString());
        //3.保存到page对象到request域中
        req.setAttribute("page", page);
        //4.请求转发
        req.getRequestDispatcher("/pages/client/index.jsp").forward(req, resp);
    }
}
