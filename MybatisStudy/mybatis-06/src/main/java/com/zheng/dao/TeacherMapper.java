package com.zheng.dao;

import com.zheng.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-23-14:58
 */
public interface TeacherMapper {
    //获取老师
    List<Teacher> getTeacher();
    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacherById(@Param("tid")int id);

}
