package cn.lyf.demo_project.dao;

import cn.lyf.demo_project.dao.impl.StudentDaoImpl;
import cn.lyf.demo_project.domain.Student;
import org.junit.Test;

import java.sql.Date;
import java.util.List;


/**
 * Date:2021/3/10 11:00
 * Author:lyf
 */
public class StudentDaoTest {

    private IStudentDao studentDao = new StudentDaoImpl();

    @Test
    public void insert() {
        Student student = new Student();
        student.setBirthYear(new Date(2021-1900,3,10));
        student.setCollegeID(3);
        student.setGrade(new Date(2017-1900,9,1));
        student.setSex("男");
        student.setUserName("阿强");
        studentDao.insert(student);
    }

    @Test
    public void deleteById() {
        studentDao.deleteById(10007);
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setBirthYear(new Date(2021-1900,3,10));
        student.setCollegeID(3);
        student.setGrade(new Date(2017-1900,9,1));
        student.setSex("女");
        student.setUserName("阿珍");
        student.setUserId(10006);
        studentDao.update(student);
    }

    @Test
    public void selectById() {
        Student student = studentDao.selectById(10006);
        System.out.println(student);
    }

    @Test
    public void selectAll() {
        List<Student> students = studentDao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}