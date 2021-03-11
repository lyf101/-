package cn.lyf.dao.impl;

import cn.lyf.dao.IStudentDAO;
import cn.lyf.domain.Student;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/11 19:49
 * Author:lyf
 */
public class StudentDAOImpl implements IStudentDAO {
    @Override
    public void insert(Student student) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.insert("cn.lyf.mapper.IStudentMapper.insert",student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.delete("cn.lyf.mapper.IStudentMapper.deleteById",id);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void update(Student student) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.update("cn.lyf.mapper.IStudentMapper.update",student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public Student selectById(int id) {

        SqlSession sqlSession = MybatisUtil.openSession();
        Student student = sqlSession.selectOne("cn.lyf.mapper.IStudentMapper.selectById", id);
        sqlSession.commit();
        sqlSession.close();
        return student;
    }

    @Override
    public List<Student> selectAll() {

        List<Student> list = null;
        SqlSession sqlSession = MybatisUtil.openSession();
        list= sqlSession.selectList("cn.lyf.mapper.IStudentMapper.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return list;
    }
}
