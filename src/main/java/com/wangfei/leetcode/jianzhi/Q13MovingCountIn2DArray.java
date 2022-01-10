package com.wangfei.leetcode.jianzhi;

public class Q13MovingCountIn2DArray {
    public static void main(String[] args) {
        int m = 2, n = 3, k = 1;
        System.out.println(new Q13MovingCountIn2DArray().movingCount(m, n, k));
    }

    public int movingCount(int m, int n, int k) {
        if(m == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[m][n];
        // 不能用变量进下一个栈帧的想法，这个dfs就是返回最后的结果【有方向性】
        return dfs(0, 0, m, n, k, visited);
    }

    private int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if(i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }

    private int myDigit(int i) {
        int sum = 0;
        // 取各个数字和最好从个位数开始
        while(i != 0) {
            sum += i / 10;
            i %= 10;
        }
        return sum;
    }
}
