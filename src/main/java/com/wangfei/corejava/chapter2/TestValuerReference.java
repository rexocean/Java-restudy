package com.wangfei.corejava.chapter2;

import java.util.Random;

public class TestValuerReference {
    public static void main(String[] args) {
        Manager boss = new Manager(new Random(1));
        Employee fred = new Employee("fred", 1000.0);
        System.out.println(fred.getSalary() + "before");
        boss.giveRandomRaise(fred);
        System.out.println(fred.getSalary() + "after");
        System.out.println("cesi");


        System.out.println("=========================");
        double sales = 1000.0;
        Employee alter = new Employee("alter", sales);
        System.out.println(alter.getSalary() + "before");
        boss.increaseRandomly(sales);
        System.out.println(alter.getSalary() + "after");
    }
}
