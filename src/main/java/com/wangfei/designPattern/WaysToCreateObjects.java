package com.wangfei.designPattern;

import java.io.*;

public class WaysToCreateObjects {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Person p2 = (Person) Class.forName("com.wangfei.designPattern.Person").newInstance();
        Person p3 = (Person) Person.class.getConstructors()[0].newInstance();

        Person p4 = (Person) person.clone();
        // p5反序列化
        Person p5 = (Person) person.deepClone();

        System.out.println(person);
        System.out.println(p2 == person);
        //System.out.println(p3 == person);
        System.out.println(p4 == person);
        System.out.println(p5 == person);
    }
}

class Person implements Serializable, Cloneable {

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //深度拷贝
    public Object deepClone() throws Exception {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}
