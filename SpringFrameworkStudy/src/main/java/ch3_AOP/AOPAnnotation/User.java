package ch3_AOP.AOPAnnotation;

import org.springframework.stereotype.Component;

/**
 * @author ZhengXinchang
 * @create 2021-10-04-9:38
 */
@Component
public class User {
    public void add(){
        System.out.println("add.......");
    }
}
