package com.wangfei.designPattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        // 使用类的构造器
        Targetable target = new Adapter1();
        target.editTextFile();
        target.editWordFile();

        // 使用对象的构造器
        Source source = new Source();
        Targetable target2 = new ObjectAdapter(source);
        target2.editTextFile();
        target2.editWordFile();

        // 使用接口适配器
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();
        sourceable1.editTextFile();
        sourceable2.editWordFile();
    }
}
