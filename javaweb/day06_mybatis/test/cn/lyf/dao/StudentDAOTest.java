package cn.lyf.dao;

import cn.lyf.dao.impl.StudentDAOImpl;
import cn.lyf.domain.Student;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/11 20:06
 * Author:lyf
 */
public class StudentDAOTest {

    private IStudentDAO studentDAO = new StudentDAOImpl();

    @Test
    public void insert() {
        Student student = new Student();

        student.setUsername("新人1");
        student.setSex("男");
        student.setGrade(new Date());
        student.setBirthday(new Date());
        student.setCollegeID(3);

        studentDAO.insert(student);
    }

    @Test
    public void deleteById() {
        studentDAO.deleteById(10009);
    }

    @Test
    public void update() {
        Student student = new Student();

        student.setUsername("新人2");
        student.setSex("男");
        student.setGrade(new Date());
        student.setBirthday(new Date());
        student.setCollegeID(3);
        student.setId(10001);

        studentDAO.update(student);

    }

    @Test
    public void selectById() {
        Student student = studentDAO.selectById(10001);
        System.out.println(student);
    }

    @Test
    public void selectAll() {
        List<Student> list = studentDAO.selectAll();
        list.forEach(System.out::println);
    }
}