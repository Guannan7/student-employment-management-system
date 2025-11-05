package com.yfh.pojo;

import java.util.List;

public class IClass {
    private Integer id;
    private String classname;
    private List<IStudent> studentList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<IStudent> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<IStudent> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "班级信息{" +
                "序号=" + id +
                ", 班级姓名='" + classname + '\'' +
                ", 学生=" + studentList +
                '}';
    }
}
