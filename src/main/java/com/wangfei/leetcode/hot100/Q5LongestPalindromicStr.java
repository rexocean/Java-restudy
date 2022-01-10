package com.wangfei.leetcode.hot100;

public class Q5LongestPalindromicStr {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(new Q5LongestPalindromicStr().longestPalindrome(s));
        System.out.println(new Q5LongestPalindromicStr().longestPalindrome1(s));
    }

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        if(len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        char[] charArray = s.toCharArray();

        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(validPalindromic(charArray, i, j) && (j - i + 1 > maxLen)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    private boolean validPalindromic(char[] charArray, int i, int j) {
        while(i < j) {
            if(charArray[i] != charArray[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    public String longestPalindrome1(String s) {
        if(s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }

    public String longestPalindrome2(String s) {
        int len = s.length();
        if(len < 2) return s;
        char[] charArr = s.toCharArray();
        int begin = 0;
        int maxLen = 0;

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for(int j = 1; j < len; j ++ ) {
            for(int i = 0; i < len ; i ++) {
                if(charArr[i] == charArr[j]) {
                    if(j - i < 3) dp[i][j] = true;
                    else dp[i][j] =dp[i + 1][j - 1];
                }
                if(dp[i][j] && j - i + 1 > maxLen) {
                    begin = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


}
