package com.ahu.jdbc;

/**
 * @author ahufxf
 * @create 2021-10-01 23:04
 */
public class Person {
    int age;
    String name;

    //假设不给父类提供空参构造器，子类无法默认调用父类空参构造器，只能手动super
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
