package com.wangfei.leetcode.jianzhi;

import java.util.HashMap;
import java.util.Map;

public class Q50FirstUniqChar {
    public static void main(String[] args) {

    }
    public char firstUniqChar(String s) {
        if(s.equals("")) return ' ';
        char[] dic = new char[26];
        for(int i = 0; i < s.length(); i ++) {
            dic[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i ++) {
            if(dic[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }

        return ' ';
    }

    public char firstUniqChar1(String s) {
        int len = s.length();
        if(s == null || len == 0) return ' ';
        Map<Character,Integer> set = new HashMap<>();
        boolean[] visites = new boolean[len];

        for(int i = 0; i < len; i ++) {
            char c = s.charAt(i);
            if(set.containsKey(c)) {
                visites[i] = true;
                visites[set.get(c)] = true;
            }else{
                set.put(c,i);
            }
        }

        for(int i = 0; i < len; i ++) {
            if(!visites[i])
                return s.charAt(i);
        }
        return ' ';
    }

    public char firstUniqChar2(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }
}
