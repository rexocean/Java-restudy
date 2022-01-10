package com.wangfei.leetcode.hot100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3LongestSubStrWithoutRepeatChars {
    public static void main(String[] args) {
        String s = " ";
        String s1 = " ";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring1(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int left = 0, max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        System.out.println("max=" + max);
        map.forEach(((character, integer) -> {
            System.out.println(character + "-" + integer);
        }));
        return max;
    }
    /*
        null，空字符对应ASCII码的0（创建一个字符数组，其默认值是'\u0000'，转成整数就是0）
        数字的0-9对应ASCII码的48-57
        大写字母的A-Z对应ASCII码的65-90
        小写字母的a-z对应ASCII码的97-122
     */

    private static int lengthOfLongestSubstring1(String s) {
        if(s == null || s.length() == 0) return 0;
        int[] m = new int[128];
        int len = 0;
        for(int left = 0, i = 0; i < s.length(); i++){
            left = Math.max(left, m[s.charAt(i)]);
            len = Math.max(len, i - left + 1);
            m[s.charAt(i)] = i + 1;
        }
        return len;
    }

}
