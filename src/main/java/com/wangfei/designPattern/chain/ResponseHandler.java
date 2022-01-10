package com.wangfei.designPattern.chain;

public class ResponseHandler extends AbstractHandler implements Handler {
    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("msg  resp...");
        if (getHandler() != null) {
            // 执行责任链的下一个流程
            getHandler().operator();
        }
    }
}
