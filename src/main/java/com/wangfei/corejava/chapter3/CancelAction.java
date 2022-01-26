package com.wangfei.corejava.chapter3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.awt.*;
import java.util.function.Consumer;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 14:52
 * @Version 1.0
 */
public class CancelAction implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("oh noes!");
    }

    public static void main(String[] args) {
        Button cancel = new Button("Cancel");
        // Java中给按钮添加，一些当按钮被单击时你想要运行的代码。其他语言，只需要给按钮一个执行函数就行，无需创建类并实例化。
        cancel.setOnAction(new CancelAction());
        Consumer<ActionEvent> actionEventConsumer = (ActionEvent event) -> System.out.println();

    }
}
