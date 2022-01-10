package com.wangfei.yuanmaJdk.core;

public class ObjectTest {
    public static void main(String[] args) {
        System.out.println(null instanceof Person);
        System.out.println();
        Person p1 = new Person("Tom", 21);
        Person p2 = new Person("Mary", 22);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        Person p3 = new Person("Tom", 21);
        System.out.println(p1.equals(p3));
        System.out.println(p1 == p3);


        System.out.println("jicheng==============================");
        Person p = new Person("Jack", 22);
        Man m = new Man("Jack", 22, "男");
        Man m1 = new Man("Jack", 22, "女");
        System.out.println("p.equals(m)" + p.equals(m));
        System.out.println("m.equals(p)" + m.equals(p));
        System.out.println("m.equals(p)" + m.equals(m1));
        System.out.println("测试getClass");
        testGetClass();
    }

    public boolean equals(String a, Object object) {
        if (a == object) {
            return true;
        }
        if (object instanceof String) {
            String anotherString = (String) object;
            int n = a.toCharArray().length;
            if (n == anotherString.toCharArray().length) {
                char[] v1 = a.toCharArray();
                char[] v2 = anotherString.toCharArray();
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i]) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    public static void testGetClass() {
        Man man = new Man("fay", 22, "男");
        Person p = new Person("fay", 23);

        Person p2 = new Man("nan");


        System.out.println(man.getClass());
        System.out.println(Man.class);
        System.out.println(p.getClass());
        System.out.println(Person.class);
        System.out.println(p2.getClass());
        System.out.println(Person.class);

        Class<? extends String> aClass = " ".getClass();
        Object o = new Object();

        System.out.println("".getClass());
        System.out.println(String.class);
        System.out.println(Object.class);
        System.out.println(o.getClass());

    }
}


