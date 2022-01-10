package com.wangfei.designPattern.adapter;

public class Adapter1 extends Source implements Targetable {
    @Override
    public void editWordFile() {
        System.out.println("a word file editing");
    }
}
