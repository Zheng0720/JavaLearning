package spring_ioc_ano;

import com.zheng.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring_ioc_ano.config.SpringConfiguration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author ZhengXinchang
 * @create 2021-10-06-9:37
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"},classes = {SpringConfiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        userDao.save();
    }
    @Test
    public void test2() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
