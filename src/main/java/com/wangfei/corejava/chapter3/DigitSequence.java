package com.wangfei.corejava.chapter3;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 16:03
 * @Version 1.0
 */
public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean hasNext() {
        return number != 0;
    }

    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }
}
