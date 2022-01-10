package com.wangfei.designPattern.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone hw = factory.createPhone("HW");
        Phone apple = factory.createPhone("Apple");
        System.out.println(hw.brand());
        System.out.println(apple.brand());
    }
}
