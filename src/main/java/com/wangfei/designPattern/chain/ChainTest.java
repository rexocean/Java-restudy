package com.wangfei.designPattern.chain;

public class ChainTest {
    // 首先定义各个责任链组件，将各个组件通过setHandler串联起来，最后调用第一个责任链的operator()
    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BizHandler bizHandler = new BizHandler("biz");
        ResponseHandler responseHandler = new ResponseHandler("resp");

        authHandler.setHandler(bizHandler);
        bizHandler.setHandler(responseHandler);

        authHandler.operator();
    }


}
