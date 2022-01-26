package com.wangfei.corejava.chapter3;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Title:
 * @Description:
 * @Author Fay Wang
 * @Date 2022/1/26 17:12
 * @Version 1.0
 */
public class TestMethodRef {
    public static void main(String[] args) {
        String[] strings = {"ab", "bc", "def"};
        Arrays.sort(strings, String::compareToIgnoreCase);

        List<String> list = Lists.newArrayList(strings);
        /*list.removeIf(String::isEmpty);
        list.removeIf(Objects::isNull);
        list.removeIf(Objects::nonNull);
        list.forEach(System.out::println);*/

        Stream<Student> studentStream = list.stream().map(Student::new);
        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());


        Student[] students = studentStream.toArray(Student[]::new);

    }
}
