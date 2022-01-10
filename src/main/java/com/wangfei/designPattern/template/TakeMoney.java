package com.wangfei.designPattern.template;

public class TakeMoney extends AbstractTemplate{
    @Override
    public void handleBusiness() {
        System.out.println("take money from bank...");
    }
}
