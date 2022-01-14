package com.wangfei.corejava.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int lastId = 0;
    private int id;

    public Student() {
        lastId++;
        id = lastId;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            System.out.println(student.id + "vs" + lastId);
            list.add(student);
        }

        /*ExecutorService helper = Executors.newFixedThreadPool(10);
        helper.submit(() -> {
            Student student = new Student();
            System.out.println(student.id + "vs" + lastId);
        });*/

        list.forEach(student -> System.out.println("集合中:" + student.id + ":" + lastId));
    }


}
