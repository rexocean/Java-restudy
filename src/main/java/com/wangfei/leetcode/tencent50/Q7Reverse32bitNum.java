package com.wangfei.leetcode.tencent50;

public class Q7Reverse32bitNum {
    public static void main(String[] args) {
        System.out.println(new Q7Reverse32bitNum().reverse(123));
        System.out.println(new Q7Reverse32bitNum().reverse(-123));
    }

    private int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int tmp = x % 10;
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE/10 && tmp > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
