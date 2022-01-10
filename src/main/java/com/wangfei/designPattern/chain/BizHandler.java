package com.wangfei.designPattern.chain;

public class BizHandler extends AbstractHandler implements Handler {
    private String name;

    public BizHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("biz info handling...");
        if (getHandler() != null) {
            // 执行责任链的下一个流程
            getHandler().operator();
        }
    }
}
