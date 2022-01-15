package com.wangfei.corejava.chapter3;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 15:58
 * @Version 1.0
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }

    public int next() {
        i++;
        return i * i;
    }
}
