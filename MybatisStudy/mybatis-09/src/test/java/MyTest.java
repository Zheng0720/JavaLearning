import com.zheng.dao.UserMapper;
import com.zheng.pojo.User;
import com.zheng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-10:57
 */
public class MyTest {
    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(2);
        System.out.println(user);


//        mapper.updateUser(new User(2,"天津大学","12222"));
        sqlSession.clearCache();

        System.out.println("=======================");
        User user2 = mapper.queryUserById(2);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(2);
        System.out.println(user);
        sqlSession.close();

        System.out.println("=======================");
        User user2 = mapper2.queryUserById(2);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession2.close();

    }
}
