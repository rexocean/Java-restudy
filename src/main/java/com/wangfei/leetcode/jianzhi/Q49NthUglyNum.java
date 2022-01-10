package com.wangfei.leetcode.jianzhi;

public class Q49NthUglyNum {
    public static void main(String[] args) {
        System.out.println(new Q49NthUglyNum().nthUglyNum(9));
    }

    public int nthUglyNum(int n) {
        int a = 1, b = 1, c = 1;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            dp[i] = Math.min(a * 2, Math.min(b * 3, c * 5));
            if(dp[i] == a * 2) a++;
            if(dp[i] == b * 3) b++;
            if(dp[i] == c * 5) c++;
        }
        return dp[n - 1];
    }
}
