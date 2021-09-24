package com.zheng.dao;

import com.zheng.pojo.Student;
import com.zheng.pojo.Teacher;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-23-14:58
 */
public interface StudentMapper {
    //查询所有的学生信息，以及对应的老师信息
    public List<Student> getStudent();
    public List<Student> getStudent2();

}
