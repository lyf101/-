package cn.lyf.dao.impl;

import cn.lyf.dao.IGoodDAO;
import cn.lyf.domain.Good;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/13 18:47
 * Author:lyf
 */
public class GoodDAOImpl implements IGoodDAO {
    @Override
    public void insert(Good good) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.insert("cn.lyf.mapper.GoodMapper.insert",good);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.delete("cn.lyf.mapper.GoodMapper.deleteById",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Good good) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.update("cn.lyf.mapper.GoodMapper.update",good);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public Good selectById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        Good good = sqlSession.selectOne("cn.lyf.mapper.GoodMapper.selectById",id);
        sqlSession.commit();
        sqlSession.close();
        return good;
    }

    @Override
    public List<Good> selectAll() {

        SqlSession sqlSession = MybatisUtil.openSqlSession();
        List<Good> list = sqlSession.selectList("cn.lyf.mapper.GoodMapper.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return list;
    }
}
