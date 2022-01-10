package com.wangfei.designPattern.template;

public abstract class AbstractTemplate {

    /**
     *  模板方法，用于核心流程和算法的定义
     */
    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }

    public void checkNumber() {
        // 抽号
        System.out.println("checkNum");
    }

    public void queueUp() {
        // 排队
        System.out.println("queue up");
    }

    // 办理业务
    public abstract void handleBusiness();

    // 服务评价
    public void serviceEvaluation() {
        System.out.println("biz finished, srv evaluation");
    }
}
