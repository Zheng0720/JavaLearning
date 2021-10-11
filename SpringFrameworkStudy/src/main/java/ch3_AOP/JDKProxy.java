package ch3_AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-19:12
 */
public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDao userDao=new UserDaoImpl();
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDapProxy(userDao));
        int add = userDao1.add(1, 2);
        System.out.println(add);
    }
}

class UserDapProxy implements InvocationHandler {

    private Object obj;

    public UserDapProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+":传递的参数...."+ Arrays.toString(args));

        Object invoke = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行...."+obj);
        return invoke;
    }

}
