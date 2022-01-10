package com.wangfei.designPattern.adapter;

public class SourceSub2 extends AbstractAdapter {
    @Override
    public void editWordFile() {
        System.out.println("a word file editing...");
    }
}
