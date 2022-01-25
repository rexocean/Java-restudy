package com.wangfei.corejava.chapter3;

import java.util.Collection;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 16:00
 * @Version 1.0
 */
public class InterfaceClient {

    public static double average(IntSequence seq, int n) {
        int cnt = 0;
        double sum = 0;
        while (seq.hasNext() && cnt < n) {
            cnt++;
            sum += seq.next();
        }
        return cnt == 0 ? 0 : sum / cnt;
    }
    public static void main(String[] args) {
        IntSequence squares = new SquareSequence();
        double average = average(squares, 100);
        System.out.println("squares" + average);
        IntSequence digit = new DigitSequence(1729);
        double average1 = average(digit, 100);// 只会处理各个位数，这里只有4个数
        System.out.println("digit" + average1);

        Collection
    }
}
