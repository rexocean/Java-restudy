package com.wangfei.corejava.chapter3;

import java.util.concurrent.Callable;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 14:37
 * @Version 1.0
 */
public class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}

class Hello2Task implements Callable<String> {
    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
