package com.wangfei.corejava.chapter2;

import java.util.Random;

public class Employee {
    private String name;
    private int id;
    private double salary;

    {// 初始化代码块
        Random generator = new Random();
        id = 1 + generator.nextInt(1_000_000);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 10;
        salary += raise;
    }
}
