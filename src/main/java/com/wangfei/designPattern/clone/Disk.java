package com.wangfei.designPattern.clone;

public class Disk implements Cloneable {
    // 应用对象深复制
    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    public Object clone() {
        try {
            return (Disk) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
