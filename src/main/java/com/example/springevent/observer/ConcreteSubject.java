package com.example.springevent.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        // 注册观察者
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // 移除观察者
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object object) {
        // 通知观察者
        for (Observer observer : observers) {
            observer.update(object);
        }
    }
}
