package com.wangfei.leetcode.jianzhi;

import java.util.Deque;
import java.util.LinkedList;

public class Q31ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};
        System.out.println(new Q31ValidateStackSequences().validateStackSequences(pushed, popped));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stk = new LinkedList<>();
        int i = 0, j = 0;
        int len = pushed.length;
        while(j < len) {
            if(i < len) {
                stk.push(pushed[i]);
                i++;
            }
            while(!stk.isEmpty() && stk.peek() == popped[j]) {
                stk.pop();
                j++;
            }
        }
        return stk.isEmpty();
    }
}
