package ch3_AOP.AOPAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author ZhengXinchang
 * @create 2021-10-04-9:40
 */
//增强的类
@Component
@Aspect  //生成代理对象
public class UserProxy {

    //前置方法
    @Before(value = "execution(* ch3_AOP.AOPAnnotation.User.add(..))")
    public void before() {
        System.out.println("before......");
    }

    @AfterReturning(value = "execution(* ch3_AOP.AOPAnnotation.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }

    @After(value = "execution(* ch3_AOP.AOPAnnotation.User.add(..))")
    public void after() {
        System.out.println("after.....");
    }

    @AfterThrowing(value = "execution(* ch3_AOP.AOPAnnotation.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    @Around(value = "execution(* ch3_AOP.AOPAnnotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around之前.....");
        proceedingJoinPoint.proceed();
        System.out.println("around之后.....");
    }


}
