package ch3_AOP;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-19:11
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
