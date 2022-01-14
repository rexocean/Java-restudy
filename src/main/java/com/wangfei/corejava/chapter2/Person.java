package com.wangfei.corejava.chapter2;

import java.util.ArrayList;

public class Person {
    private final String name;
    private double age;

    private final ArrayList<Person> friends = new ArrayList<>();
    // 可以给该数组列表添加元素

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }

    public static void main(String[] args) {
        Person jerry = new Person("jerry", 23);
        System.out.println(jerry.friends.size());

        jerry.friends.add(new Person("tom", 12));
        System.out.println(jerry.friends.size());
        jerry.friends.forEach(person -> System.out.println(person.toString()));

        jerry.friends.remove(0);
        System.out.println(jerry.friends.size());


    }
}
