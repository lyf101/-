package cn.lyf.test;


import cn.lyf.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.sql.Date;

/**
 * Date:2021/3/11 12:49
 * Author:lyf
 */
public class MybatisDemo {
    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        Student student = new Student();
        student.setBirthday(new Date(2021-1900,3-1,11));
        student.setGrade(new Date(2021-1900,3-1,11));
        student.setCollegeID(2);
        student.setSex("男");
        student.setUsername("老吴");
        student.setId(10005);
        sqlSession.update("cn.lyf.mapper.IStudentMapper.update",student);
        sqlSession.commit();
        sqlSession.close();
    }
}
