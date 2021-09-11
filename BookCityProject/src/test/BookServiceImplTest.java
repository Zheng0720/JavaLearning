package test;

import org.junit.Test;
import pojo.Book;
import pojo.Page;
import service.BookService;
import service.impl.BookServiceImpl;

import static org.junit.Assert.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-10-15:24
 */
public class BookServiceImplTest {

    @Test
    public void page() {
        BookService bookService=new BookServiceImpl();
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }
}