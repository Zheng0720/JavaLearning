package spring_ioc_ano.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ZhengXinchang
 * @create 2021-10-05-16:33
 */

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save......");
    }
}
