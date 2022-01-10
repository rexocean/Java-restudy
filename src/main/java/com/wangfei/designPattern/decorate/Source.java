package com.wangfei.designPattern.decorate;

public class Source implements Sourceable {

    @Override
    public void createComputer() {
        System.out.println("create computer by Source");
    }
}
