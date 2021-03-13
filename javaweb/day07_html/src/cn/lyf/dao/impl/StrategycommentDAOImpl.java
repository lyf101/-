package cn.lyf.dao.impl;

import cn.lyf.dao.IStrategycommentDAO;
import cn.lyf.domain.Strategycomment;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/13 19:36
 * Author:lyf
 */
public class StrategycommentDAOImpl implements IStrategycommentDAO {
    @Override
    public void insert(Strategycomment strategycomment) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.insert("cn.lyf.mapper.StrategycommentMapper.insert",strategycomment);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.delete("cn.lyf.mapper.StrategycommentMapper.delete",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Strategycomment strategycomment) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        sqlSession.update("cn.lyf.mapper.StrategycommentMapper.update",strategycomment);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public Strategycomment selectById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        Strategycomment strategycomment = sqlSession.selectOne("cn.lyf.mapper.StrategycommentMapper.selectById",id);
        sqlSession.commit();
        sqlSession.close();
        return strategycomment;
    }

    @Override
    public List<Strategycomment> selectAll() {
        SqlSession sqlSession = MybatisUtil.openSqlSession();
        List<Strategycomment> list = sqlSession.selectList("cn.lyf.mapper.StrategycommentMapper.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return list;
    }
}
