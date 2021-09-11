package test;

import dao.BookDao;
import dao.impl.BookDaoImpl;
import org.junit.Test;
import pojo.Book;
import pojo.Page;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-17:41
 */
public class BookDaoImplTest {
    private BookDao bookDao=new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"三国演义",100,"罗贯中",99,100,null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(20,"三国演义",100,"罗贯中",99,100,null));
    }

    @Test
    public void queryBookById() {
        Book book = bookDao.queryBookById(17);
        System.out.println(book);
    }

    @Test
    public void queryBookByName() {
        System.out.println(bookDao.queryBookByName("三国演义"));
    }

    @Test
    public void queryBooks() {
        List<Book> books = bookDao.queryBooks();
        for(Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageTotalCount(){
        System.out.println(bookDao.queryForPageTotalCount());
    }
    @Test
    public void queryForPageItems(){
        List<Book> books = bookDao.queryForPageItems(4, 5);
        for(Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        Integer integer = bookDao.queryForPageTotalCountByPrice(100, 200);
        System.out.println(integer);
    }

    @Test
    public void queryForPageItemsByPrice() {
        List<Book> books = bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE, 100, 200);
        for(Book book:books){
            System.out.println(book);
        }


    }
}