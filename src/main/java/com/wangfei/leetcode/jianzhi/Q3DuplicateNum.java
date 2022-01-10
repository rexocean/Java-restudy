package com.wangfei.leetcode.jianzhi;

public class Q3DuplicateNum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    private static int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != i && nums[nums[i]] != nums[i]) {
                swap(nums, nums[i], i);
            }
            if(nums[i] != i && nums[nums[i]] == nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
