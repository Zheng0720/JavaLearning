package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZhengXinchang
 * @create 2021-09-09-15:15
 */
public class UserServletTest {
    public void login() {
        System.out.println("这是login方法调用了");
    }

    public void regist() {
        System.out.println("这是regist方法调用了");
    }

    public void update() {
        System.out.println("这是update方法调用了");
    }

    public void updateUserPassword() {
        System.out.println("这是updateUserPassword方法调用了");
    }

    public static void main(String[] args) {
        String action="login";
        try {
            Method method = UserServletTest.class.getDeclaredMethod(action);
            method.invoke(new UserServletTest());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
