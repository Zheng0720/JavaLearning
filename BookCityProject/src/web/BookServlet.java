package web;

import pojo.Book;
import pojo.Page;
import service.BookService;
import service.impl.BookServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-18:29
 */
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        1.获取请求的参数,封装成为Book对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(), new Book());
        int pageNo = Integer.parseInt(req.getParameter("pageNo"));
        pageNo++;
//        2.调用BookService.addBook()保存图书
        bookService.addBook(book);
//        3、跳到图书列表页面
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + pageNo);

    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.获取请求的参数,封装成为Book对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(), new Book());
        String pageNo = req.getParameter("pageNo");
//        2.调用BookService.updateBook( book );修改图书
        bookService.updateBook(book);
//        3.重定向回图书列表管理页面
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + pageNo);
    }

    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求图书编号
        String id = req.getParameter("id");
        //调用bookService查询图书
        Book book = bookService.queryBookById(Integer.parseInt(id));
        //保存图书到request域中
        req.setAttribute("book", book);
        //请求转发
        req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req, resp);

    }


    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//            1.获取请求的参数id
        String id = req.getParameter("id");
//            2.调用bookService.deleteBpokById删除图书
        bookService.deleteBookById(Integer.parseInt(id));
        String pageNo = req.getParameter("pageNo");
//            3.重定向回图书列表管理页面
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo=" + pageNo);


    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通用bookService查询数据
        List<Book> books = bookService.queryBooks();
        //把全部图书保存到request中
        req.setAttribute("books", books);
        //请求转发
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }

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
        page.setUrl("manager/bookServlet?action=page");
        //3.保存到page对象到request域中
        req.setAttribute("page", page);
        //4.请求转发
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }
}
