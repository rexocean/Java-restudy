package com.wangfei.designPattern.adapter;

public class SourceSub1 extends AbstractAdapter {
    @Override
    public void editTextFile() {
        System.out.println("a text file editing....");
    }
}
