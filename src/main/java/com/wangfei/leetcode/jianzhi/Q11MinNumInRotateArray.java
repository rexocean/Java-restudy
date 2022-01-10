package com.wangfei.leetcode.jianzhi;

public class Q11MinNumInRotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(minArray(nums));
    }

    private static int minArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int n = nums.length - 1;
        while(n > 0 && nums[0] == nums[n]) {
            --n;
        }
        if(nums[0] < nums[n]) {
            return nums[0];
        }

        int l = 0, r = n;
        while( l < r) {
            int mid = (l + r) / 2;
            // 用mid值每次和第一个数比较，如果小则表明可能是最后的min，动r；否则动l。
            if(nums[mid] < nums[0]) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
