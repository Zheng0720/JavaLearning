package dao;

import com.zheng.dao.UserMapper;
import com.zheng.pojo.User;
import com.zheng.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author ZhengXinchang
 * @create 2021-09-16-14:51
 */
public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test() {

        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);

        System.out.println(user);
        //3.关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j方法");
        logger.debug("debug:进入了testLog4j方法");
        logger.error("error:进入了testLog4j方法");
    }
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Integer> map=new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> users = mapper.getUserByLimit(map);

        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1,2);

        List<User> userList = sqlSession.selectList("com.zheng.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }



}
