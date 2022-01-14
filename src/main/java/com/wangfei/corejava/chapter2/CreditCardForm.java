package com.wangfei.corejava.chapter2;

import java.time.LocalDate;
import java.util.ArrayList;


public class CreditCardForm {

    private static final ArrayList<Integer> expirationYear = new ArrayList<>();

    static {
        // 将下一个20年添加到列表中
        int year = LocalDate.now().getYear();
        for (int i = year; i <= year + 20; i++) {
            expirationYear.add(i);

        }
    }

    public double pow(double base, double exponent) {
        return 0.0d;
    }

    public static void main(String[] args) {
        System.out.println(CreditCardForm.expirationYear.size());
        CreditCardForm.expirationYear.forEach(System.out::println);

        System.out.println();


        System.out.println(new CreditCardForm().pow(1, 2) + " ");
    }
}
