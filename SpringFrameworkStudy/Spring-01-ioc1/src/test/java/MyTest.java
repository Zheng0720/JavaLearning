import com.zheng.dao.UserDao;
import com.zheng.service.UserService;
import com.zheng.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-16:34
 */
public class MyTest {
    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userDao = (UserService) context.getBean("UserServiceImpl");
        userDao.getUser();
    }

}
