package cn.lyf.jdbc_demo.dao.impl;

import cn.lyf.jdbc_demo.dao.IStudentDao;
import cn.lyf.jdbc_demo.domain.Student;
import cn.lyf.jdbc_demo.util.DMLUtil;

import java.util.List;

/**
 * Date:2021/3/8 18:25
 * Author:lyf
 */
public class StudentImpl implements IStudentDao {
    @Override
    public void insert(Student student) {
        String sql = "insert into student values(null,?,?)";
        DMLUtil.update(sql,student.getName(),student.getAge());

    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from student where id = ?";
        DMLUtil.update(sql,id);
    }

    @Override
    public void update(Student student) {
        String sql = "update student set name = ?, age = ? where id = ?";
        DMLUtil.update(sql,student.getName(),student.getAge(),student.getId());

    }

    @Override
    public Student selectById(int id) {
        String sql = "select * from student where id = ?";
        List<Student> query = DMLUtil.query(sql, id);
        if (query!=null&&query.size()>0){
            return query.get(0);
        }
        return new Student();

    }

    @Override
    public List<Student> selectAll() {
        String sql = "select * from student";
        List<Student> query = DMLUtil.query(sql);
        return query;
    }
}
