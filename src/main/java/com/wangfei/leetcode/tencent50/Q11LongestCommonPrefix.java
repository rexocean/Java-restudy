package com.wangfei.leetcode.tencent50;

public class Q11LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        int j = 0;
        for (String s : strs) {
            for(; j < s.length() && j < ans.length(); j++) {
                if(ans.charAt(j) != s.charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if(ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }
}
