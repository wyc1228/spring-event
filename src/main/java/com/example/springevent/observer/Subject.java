package com.example.springevent.observer;

// 被观察者
public interface Subject {
    // 添加观察者
    void registerObserver(Observer observer);
    // 移除观察者
    void removeObserver(Observer observer);
    // 通知观察者
    void notifyObservers(Object object);
}