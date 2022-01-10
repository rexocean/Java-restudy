package com.wangfei.designPattern.factory;

public class Factory {

    public Phone createPhone(String phoneName) {
        if ("HW".equals(phoneName)) {
            return new Huawei();
        } else if ("Apple".equals(phoneName)) {
            return new IPhone();
        } else {
            return null;
        }
    }
}
