package com.qinli.puzzle02.entity;

/**
 * @Author Cambria
 * @creat 2021/2/7 20:49
 */
public class Student {
    private String id;
    private String name;
    private int gender;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + (gender==1?"男":"女") +
                ", age=" + age +
                '}';
    }
}
