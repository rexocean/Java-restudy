package com.wangfei.leetcode.tencent50;

import java.util.Arrays;

public class Q26RemoveDuplicateNums {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 2, 3, 4, 5, 5};
        System.out.println(Arrays.toString(nums));
        System.out.println(new Q26RemoveDuplicateNums().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        int[] newArray = Arrays.copyOf(nums, i + 1);
        System.out.println(Arrays.toString(newArray));
        return i + 1;

    }


}
