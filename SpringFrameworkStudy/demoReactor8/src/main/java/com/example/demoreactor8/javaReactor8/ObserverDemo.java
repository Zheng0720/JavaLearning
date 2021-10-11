package com.example.demoreactor8.javaReactor8;

import java.util.Observable;

/**
 * @author ZhengXinchang
 * @create 2021-10-04-15:33
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        observer.addObserver((o,arg)->{
            System.out.println("发生了变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("收到被观察者通知，准备改变 ");
        });
        observer.setChanged();
        observer.notifyObservers();
    }
}
