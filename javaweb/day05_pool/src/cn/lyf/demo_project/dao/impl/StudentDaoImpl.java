package cn.lyf.demo_project.dao.impl;

import cn.lyf.demo_project.dao.IStudentDao;
import cn.lyf.demo_project.domain.Student;
import cn.lyf.demo_project.util.DMLUtil;

import java.util.List;

/**
 * Date:2021/3/10 10:08
 * Author:lyf
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public void insert(Student student) {
        String sql = "insert into student(userName,sex,birthYear,grade,collegeID) values(?,?,?,?,?) ";
        DMLUtil.update(sql,student.getUserName(),student.getSex(),
                student.getBirthYear(),student.getGrade(),student.getCollegeID());
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from student where userID = ?";
        DMLUtil.update(sql,id);

    }

    @Override
    public void update(Student student) {
        String sql = "update student set userName=?,sex=?,birthYear=?,grade=?,collegeID=? where userID = ?";
        DMLUtil.update(sql,student.getUserName(),student.getSex(),
                student.getBirthYear(),student.getGrade(),student.getCollegeID(),student.getUserId());
    }

    @Override
    public Student selectById(int id) {
        String sql = "select * from student where userID =?";
        List<Student> query = DMLUtil.query(sql, Student.class, id);
        if (query!=null&&query.size()>0){
            Student student = query.get(0);
            return student;
        }
        return new Student();

    }

    @Override
    public List<Student> selectAll() {
        String sql = "select * from student";
        List<Student> query = DMLUtil.query(sql, Student.class);
        return query;
    }
}
