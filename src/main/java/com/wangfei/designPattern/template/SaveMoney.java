package com.wangfei.designPattern.template;

public class SaveMoney extends AbstractTemplate {

    @Override
    public void handleBusiness() {
        // 存钱的业务
        System.out.println("save money from bank...");
    }
}
