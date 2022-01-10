package com.wangfei.leetcode.jianzhi;

public class Q16MyPow {
    public static void main(String[] args) {
        System.out.println(new Q16MyPow().myPow(2, 10));
    }

    public double myPow(double x, int n) {
        if(x == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
