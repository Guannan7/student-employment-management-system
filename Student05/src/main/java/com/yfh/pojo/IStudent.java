package com.yfh.pojo;

public class IStudent {
    private Integer id;
    private String name;
    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "学生信息{" +
                "序号=" + id +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }
}
