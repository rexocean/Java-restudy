package com.wangfei.corejava.chapter3;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/21 22:23
 * @Version 1.0
 */
public interface Channel extends Closeable {
    boolean isOpen();
}
