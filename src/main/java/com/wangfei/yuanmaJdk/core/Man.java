package com.wangfei.yuanmaJdk.core;

import java.util.Objects;

public class Man extends Person {
    private String sex;

    public Man(String sex) {
        this.sex = sex;
    }

    public Man(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Man)) {
            return false;
        }
        Man man = (Man) obj;
        return sex.equals(man.sex);
    }
}
