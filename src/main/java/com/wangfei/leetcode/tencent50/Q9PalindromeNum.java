package com.wangfei.leetcode.tencent50;

public class Q9PalindromeNum {

    public static void main(String[] args) {
        System.out.println(new Q9PalindromeNum().isPalindrome(121));
        System.out.println(new Q9PalindromeNum().isPalindrome1(121));
    }

    public boolean isPalindrome(int x) {
        String s = new StringBuilder(x + "").reverse().toString();
        return (x + "").equals(s);
    }

    public boolean isPalindrome1(int x) {
        if(x == 0) return true;
        if(x < 0 || x % 10 == 0) {
            return false;
        }
        String s = String.valueOf(x);
        for(int i = 0,  j = s.length() - 1; i < j; ) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
