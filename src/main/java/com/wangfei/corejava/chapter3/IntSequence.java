package com.wangfei.corejava.chapter3;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 15:58
 * @Version 1.0
 */
public interface IntSequence {
    boolean hasNext();

    int next();

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
}
