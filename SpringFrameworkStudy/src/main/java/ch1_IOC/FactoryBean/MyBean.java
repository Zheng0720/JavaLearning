package ch1_IOC.FactoryBean;

import ch1_IOC.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-16:27
 */
public class MyBean implements FactoryBean {

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("abc");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
