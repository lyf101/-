package cn.lyf.demo_project.dao;

import cn.lyf.demo_project.domain.Student;

import java.util.List;

/**
 * Date:2021/3/10 10:05
 * Author:lyf
 */
public interface IStudentDao {
    //增加学生信息操作
    void insert(Student student);
    //根据id删除学生信息
    void deleteById(int id);
    //修改学生信息
    void update(Student student);
    //根据id查询学生信息
    Student selectById(int id);
    //查询所有学生信息
    List<Student> selectAll();
}
