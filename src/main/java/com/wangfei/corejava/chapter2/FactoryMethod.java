package com.wangfei.corejava.chapter2;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

public class FactoryMethod {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyInstance.format(x));
        System.out.println(percentInstance.format(x));
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());

    }
}
