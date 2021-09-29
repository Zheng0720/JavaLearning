package com.zheng.pojo;

/**
 * @author ZhengXinchang
 * @create 2021-09-26-20:59
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("hello world "+name+" !");
    }
}
