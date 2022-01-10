package com.wangfei.designPattern.observe;

public class ConcreteObserver implements Observer {
    @Override
    public void dataChange(String message) {
        System.out.println("receive msg:" + message);
    }
}
