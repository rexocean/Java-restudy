package com.wangfei.leetcode.jianzhi;

import java.util.ArrayList;
import java.util.List;

public class Q38StringPermutation {
    public static void main(String[] args) {
        System.out.println();
    }

    public String[] permutation(String s) {
        if(s == null || s.length() == 0) {
            return new String[]{};
        }
        List<String> res = new ArrayList<>();
        dfs(s, res, "", 0);
        String[] ans = new String[res.size()];
        for(int i = 0; i < res.size(); i ++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void dfs(String s, List<String> res, String tmp, int i) {
        if(tmp.length() == s.length()) {
            res.add(tmp);
        }
        dfs(s, res, tmp + s.substring(i, i + 1), i + 1);

    }
}
