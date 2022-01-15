package com.wangfei.corejava.chapter3;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 16:00
 * @Version 1.0
 */
public class InterfaceClient {

    public static double average(IntSequence seq, int n) {
        int cnt = 0;
        double sum = 0;
        while (seq.hasNext() && cnt > 0) {
            cnt++;
            sum += seq.next();
        }
        return cnt == 0 ? 0 : sum / cnt;
    }
    public static void main(String[] args) {
        IntSequence squares = new SquareSequence();
        double average = average(squares, 100);
    }
}
