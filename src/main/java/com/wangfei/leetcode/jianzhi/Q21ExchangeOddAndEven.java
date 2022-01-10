package com.wangfei.leetcode.jianzhi;

import java.util.Arrays;

public class Q21ExchangeOddAndEven {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 0};
        System.out.println(Arrays.toString(new Q21ExchangeOddAndEven().exchange(nums)));
    }

    public int[] exchange(int[] nums) {
        for(int i = 0,j=nums.length-1; i<=j; ){
            while(nums[i] % 2 == 0 && j>i){
                swap(nums, i, j);
                j--;
            }
            i++;
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
