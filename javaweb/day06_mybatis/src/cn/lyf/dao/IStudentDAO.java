package cn.lyf.dao;

import cn.lyf.domain.Student;

import java.util.List;

/**
 * Date:2021/3/11 19:47
 * Author:lyf
 */
public interface IStudentDAO {
    void insert(Student student);
    void deleteById(int id);
    void update(Student student);
    Student selectById(int id);
    List<Student> selectAll();
}
