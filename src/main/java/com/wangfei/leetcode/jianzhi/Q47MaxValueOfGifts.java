package com.wangfei.leetcode.jianzhi;

public class Q47MaxValueOfGifts {
    public static void main(String[] args) {

    }

    public int maxValue(int[][] nums) {
        if(nums == null || nums.length == 0 || nums[0].length == 0) {
            return 0;
        }
        int m = nums.length, n = nums[0].length;
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = nums[i][j];
                }else if(i == 0) {
                    dp[i][j] = nums[i][j] + dp[i][j - 1];
                }else if (j == 0) {
                    dp[i][j] = nums[i][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = nums[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public int maxValue1(int[][] f) {
        //最经典的二维DP
        //f[i][j] =max(f[i-1][j],f[i][j-1]);
        int m = f.length, n = f[0].length;
        for(int i = 0; i < m ; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) f[i][j] += f[i][j - 1]; //只能从左边
                else if(j == 0) f[i][j] += f[i-1][j];//只能从上边
                else f[i][j] += Math.max(f[i-1][j],f[i][j-1]);//两边都可以
            }
        }
        return f[m-1][n-1];
    }
}
