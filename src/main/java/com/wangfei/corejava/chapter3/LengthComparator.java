package com.wangfei.corejava.chapter3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 16:24
 * @Version 1.0
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        LengthComparator comp = new LengthComparator();
        String[] fs = {"Peter", "Paul", "Mary"};
        Arrays.sort(fs, Comparator.comparingInt(String::length));
        Arrays.sort(fs, comp);
        for (String f : fs) {
            System.out.println(f);
        }
    }
}
