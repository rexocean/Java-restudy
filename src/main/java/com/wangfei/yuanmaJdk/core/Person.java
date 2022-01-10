package com.wangfei.yuanmaJdk.core;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj || getClass() != obj.getClass()) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        if (anotherPerson.getAge() == this.getAge()
                && anotherPerson.getName().equals(this.getName())) {
            return true;
        }
        return false;
    }
}
