package com.wangfei.designPattern.decorate;

public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        // 在创建完电脑后装上新系统
        System.out.println("make system...");
    }
}
