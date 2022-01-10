package com.wangfei.designPattern.template;

public class TemplateTest {

    /**
     * 使用模板模式时只需按照需求定义具体的模板类实例，并调用其模板方法即可。
     * @param args parameters
     */
    public static void main(String[] args) {
        // 办理取钱流程
        AbstractTemplate template1 = new TakeMoney();
        template1.templateMethod();

        // 办理存储流程
        AbstractTemplate template2 = new SaveMoney();
        template2.templateMethod();
    }
}
