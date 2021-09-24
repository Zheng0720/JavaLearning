package com.zheng.pojo;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-23-14:56
 */
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }


    public Teacher() {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
