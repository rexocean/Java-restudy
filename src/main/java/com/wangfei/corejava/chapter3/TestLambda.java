package com.wangfei.corejava.chapter3;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;




/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 19:32
 * @Version 1.0
 */
public class TestLambda {
    public static void main(String[] args) throws Exception {
        repeat(10,()-> System.out.println("hello world"));
        repeatIntConsumer(10, i -> System.out.println("Countdown" + (9 - i)));
        // 提供一个用两个整数产生颜色值的lambda表达式
        BufferedImage img = creatImage(150, 100, (x, y) -> x < 50 ? Color.BLUE : x < 100 ? Color.WHITE : Color.RED);
        File f = new File("MyFile.png");
        ImageIO.write(img, "PNG", f);
    }


    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeatIntConsumer(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static BufferedImage creatImage(int width, int height, PixelFunction f) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        }
        return image;
    }
}

