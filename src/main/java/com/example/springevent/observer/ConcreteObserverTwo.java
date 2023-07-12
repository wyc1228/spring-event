package com.example.springevent.observer;

public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(Object object) {
        // 获取消息通知，执行自己的逻辑...
        System.out.println("ObserverTwo is notified.");
    }
}
