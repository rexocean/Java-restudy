package com.wangfei.corejava.chapter3;

import org.jetbrains.annotations.NotNull;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/25 10:23
 * @Version 1.0
 */
public class Employee implements Person, Identified,Comparable<Employee>{
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return getId() - o.getId(); // 如果id总是大于等于0，在可以。
    }
}

