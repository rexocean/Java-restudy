package com.wangfei.designPattern.decorate;

public class DecorateTest {
    // 先定义一个待装饰的Source类的source对象，然后初始化构造器Decorator并在构造函数
    // 中传入source对象，最后调用方法。其中也可以实现装饰器自有的逻辑。
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);

        obj.createComputer();
    }
}
