package ch2_IOC_Annotation.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-16:03
 */

@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Value("郑鑫昌")
    private String name;
    @Override
    public void add() {
        System.out.println("dao add....."+name);
    }
}
