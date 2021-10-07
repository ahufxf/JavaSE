package com.ahu.extent;

/**
 * @author ahufxf
 * @create 2021-10-06 22:02
 */
public class Person {
    private int age;
    private String name;

    public Person() {
    }

    private void test1(){

    }

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
