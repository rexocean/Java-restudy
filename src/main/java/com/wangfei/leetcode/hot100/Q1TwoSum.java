package com.wangfei.leetcode.hot100;

import java.util.Arrays;
import java.util.HashMap;

public class Q1TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new ArithmeticException("没有");
    }
}
