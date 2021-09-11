package dao;

import pojo.Book;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-17:21
 */
public interface BookDao {

    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public Book queryBookByName(String name);

    public List<Book> queryBooks();

    public Integer queryForPageTotalCount();

    public List<Book> queryForPageItems(int begin,int pageSize);

    public Integer queryForPageTotalCountByPrice(int min, int max);

    public List<Book> queryForPageItemsByPrice(Integer begin, int pageSize, int min, int max);
}
