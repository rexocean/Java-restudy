package com.wangfei.leetcode.jianzhi;

public class Q15HammingWeight {

    public static void main(String[] args) {
        System.out.println(new Q15HammingWeight().hammingWeight(11));
    }

    public int hammingWeight(int n) {
        int cnt = 0;
        while(n != 0) {
            cnt ++;
            n &= n - 1;
        }
        return cnt;
    }
}
