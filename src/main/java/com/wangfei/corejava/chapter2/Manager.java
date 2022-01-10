package com.wangfei.corejava.chapter2;

import java.util.Random;

public class Manager {
    private Random generator;

    public Manager(Random generator) {
        this.generator = generator;
    }

    public void giveRandomRaise(Employee e) {
        System.out.println("in before params:" + e.getSalary());
        double percentage = 10 * generator.nextGaussian();
        e.raiseSalary(percentage);
        System.out.println("in out params:" + e.getSalary());
    }

    public void increaseRandomly(double x) {
        System.out.println("in before params:" + x);
        double amount = x * generator.nextDouble();
        x += amount;
        System.out.println("in out params:" + x);
    }
}
