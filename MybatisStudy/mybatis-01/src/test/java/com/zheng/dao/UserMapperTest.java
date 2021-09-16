package com.zheng.dao;

import com.zheng.pojo.User;
import com.zheng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-16-14:51
 */
public class UserMapperTest {

    @Test
    public void test(){

        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for(User user:userList){
            System.out.println(user);
        }
        //3.关闭SqlSession
        sqlSession.close();
    }
}
