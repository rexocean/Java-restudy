package com.wangfei.corejava.chapter3;

import java.io.IOException;
import java.util.Comparator;

/**
 * @Author Fay Wang
 * @Date 2022/1/14 16:00
 * @Version 1.0
 */
public class InterfaceClient implements Comparator<String> {

    public static double average(IntSequence seq, int n) {
        int cnt = 0;
        double sum = 0;
        while (seq.hasNext() && cnt < n) {
            cnt++;
            sum += seq.next();
        }
        return cnt == 0 ? 0 : sum / cnt;
    }
    public static void main(String[] args) throws Exception {
//        testSequenceInterface();
//        testComparable();
        testRunnableInterface();

    }

    private static void testRunnableInterface() throws Exception {
        HelloTask task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();

        Hello2Task task2 = new Hello2Task();
        String call = task2.call();
        System.out.println(call);
        //System.in.read();
    }

    private static void testComparable() {
        String a = "abcdef";
        String b = "ssss";
        System.out.println(a.compareTo(b));
        InterfaceClient comp = new InterfaceClient();
        System.out.println(comp.compare(a, b));
    }

    private static void testSequenceInterface() {
        IntSequence squares = new SquareSequence();
        double average = average(squares, 100);
        System.out.println("squares" + average);

        IntSequence digit = new DigitSequence(1729);
        double average1 = average(digit, 100);// 只会处理各个位数，这里只有4个数
        System.out.println("digit" + average1);
    }


    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
