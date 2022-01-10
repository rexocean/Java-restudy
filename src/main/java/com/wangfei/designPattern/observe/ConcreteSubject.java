package com.wangfei.designPattern.observe;

public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver(String message) {
        // 用户向观察者发送消息
        for (Observer obs : observers) {
            System.out.println("notify observer " + message + "change...");
            obs.dataChange(message);
        }
    }
}
