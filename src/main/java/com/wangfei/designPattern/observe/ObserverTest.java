package com.wangfei.designPattern.observe;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.add(observer);
        subject.notifyObserver("data1");
    }
}
