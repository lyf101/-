package cn.lyf.jdbc_demo.dao;

import cn.lyf.jdbc_demo.dao.impl.StudentImpl;
import cn.lyf.jdbc_demo.domain.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/8 18:26
 * Author:lyf
 */
public class IStudentDaoTest {

    private IStudentDao studentDao = new StudentImpl();

    @Test
    public void insert() {
        Student student = new Student();
        student.setName("老刘");
        student.setAge(24);
        studentDao.insert(student);
    }

    @Test
    public void deleteById() {
        studentDao.deleteById(13);
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setAge(1);
        student.setName("灰太狼");
        student.setId(18);
        studentDao.update(student);
    }

    @Test
    public void selectById() {
        Student student = studentDao.selectById(18);
        System.out.println(student.getName());
    }

    @Test
    public void selectAll() {
        List<Student> list = studentDao.selectAll();
        for (Student student : list) {
            System.out.println(student.getName());
        }

    }
}