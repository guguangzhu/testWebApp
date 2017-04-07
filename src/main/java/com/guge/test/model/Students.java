package com.guge.test.model;

/**
 * Created by Guge on 2017/4/7.
 */
public class Students {
    private int id;
    private String  name;
    private int age;
    private String sex;
    private int mobile;
    private int grade;


    public int getMobile() {
        return mobile;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }
}
