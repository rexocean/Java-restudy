package com.wangfei.designPattern.observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    // 增加观察者
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者的抽象方法
    public abstract void notifyObserver(String message);
}
