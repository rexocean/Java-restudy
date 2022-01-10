package com.wangfei.leetcode.jianzhi;

public class Q4FindNumIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(findNumberIn2DArray(nums, 5));
    }

    private static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length &&  j>= 0) {
            if(matrix[i][j] == target) {
                return true;
            }else if(matrix[i][j] > target) {
                --j;
            }else if(matrix[i][j] < target) {
                ++i;
            }
        }
        return false;
    }
}
