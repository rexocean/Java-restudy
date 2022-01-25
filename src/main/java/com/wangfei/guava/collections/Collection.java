package com.wangfei.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.time.LocalDate;
import java.util.*;

/**
 * @Title: guava包的集合
 * @Description: 测试集合中的特性
 * @Author Fay Wang
 * @Date 2022/1/16 19:27
 * @Version 1.0
 */
public class Collection {
    public static void main(String[] args) {
//        testList();
//        testSet();
        testMap();
    }

    private static void testMap() {
        // guava提供了能够推断泛型的静态工厂方法
        Map<Object, Object> guavaMap = Maps.newLinkedHashMap();

        int size = 2000;
        // 自带容量的
        long start = new Date().getTime();
        HashMap<String, Object> map1 = Maps.newHashMapWithExpectedSize(2048);
        for (int i = 0; i < size; i++) {
            map1.put(i + " ", i);
        }
        long mid = new Date().getTime();

        // 原生
        Map<String, Object> map2 = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map2.put(i + " ", i);
        }
        long end = new Date().getTime();
        System.out.println("提前指定容量" + (mid - start));
        System.out.println("原生" + (end - mid));
    }

    private static void testList() {
        List<TestGenericClass> guavaLists = Lists.newArrayList();

        List<TestGenericClass> jdk7Lists = new ArrayList<>();

        List<String> guavaAppointElements = Lists.newArrayList("alpha", "beta", "gamma");
    }

    /**
     * Guava引入的新集合类型MultiSet没有暴露原始构造器，
     * 也没有在工具类中提供初始化方法。而是直接在集合类中提供了静态工厂方法
     */
    private static void testSet() {
        // 不用泛型的静态工厂
        Set<String> copySet = Sets.newHashSet("haha");

        int size = 18_000;
        // 自带容量的
        long start = new Date().getTime();
        Set<String> verifySizedSet = Sets.newHashSetWithExpectedSize(20_000);
        for (int i = 0; i < size; i++) {
            verifySizedSet.add(i + "");
        }
        System.out.println("最终size为" + verifySizedSet.size());
        long mid = new Date().getTime();

        // 原生
        Set<String> sets = new HashSet<>();
        for (int i = 0; i < size; i++) {
            sets.add(i + "");
        }
        System.out.println("最终size为" + sets.size());
        long end = new Date().getTime();
        System.out.println("提前指定容量" + (mid - start));
        System.out.println("原生" + (end - mid));





        /*// 新的集合Set
        HashMultiset<String> multiset = HashMultiset.create();
        boolean test1 = multiset.add("test1");
        int test2 = multiset.add("test2", 10);
        System.out.println(test1);
        System.out.println(test2);
        //multiset.forEach(System.out::println);*/
    }
}

class TestGenericClass {
    private String name;
    private String clazz;
}
