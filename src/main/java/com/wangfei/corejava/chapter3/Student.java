package com.wangfei.corejava.chapter3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 15:04
 * @Version 1.0
 */
public class Student implements Comparable<Student> {
    private double id;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
        System.out.println(Double.compare(id, o.id));
        return Double.compare(id, o.id);
//        return Integer.compare(id, o.id);
//        return id - o.id;
    }

    public static void main(String[] args) {
        Student s1 = new Student(12.232);
        Student s2 = new Student(11.432);
        Student[] students = new Student[]{s1, s2};
        for (Student s : students) {
            System.out.println(s.toString());
        }
        Arrays.sort(students);
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
