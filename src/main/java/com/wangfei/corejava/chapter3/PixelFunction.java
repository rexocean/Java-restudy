package com.wangfei.corejava.chapter3;

import java.awt.*;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 19:48
 * @Version 1.0
 */
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
