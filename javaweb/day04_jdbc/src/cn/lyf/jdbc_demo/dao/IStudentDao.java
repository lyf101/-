package cn.lyf.jdbc_demo.dao;

import cn.lyf.jdbc_demo.domain.Student;

import java.util.List;

/**
 * Date:2021/3/8 17:29
 * Author:lyf
 */
public interface IStudentDao {
    //增加
    void insert(Student student);
    //根据id删除
    void deleteById(int id);
    //修改
    void update(Student student);
    //根据id查询
    Student selectById(int id);
    //查询所有
    List<Student> selectAll();

}
