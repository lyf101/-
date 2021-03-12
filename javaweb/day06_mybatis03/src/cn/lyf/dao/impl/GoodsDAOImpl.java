package cn.lyf.dao.impl;

import cn.lyf.dao.IGoodsDAO;
import cn.lyf.domain.Goods;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/12 10:20
 * Author:lyf
 */
public class GoodsDAOImpl implements IGoodsDAO {
    @Override
    public void insert(Goods goods) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.insert("cn.lyf.mapper.GoodsMapper.insert",goods);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.delete("cn.lyf.mapper.GoodsMapper.delete",id);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void update(Goods goods) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.update("cn.lyf.mapper.GoodsMapper.update",goods);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public Goods selectById(int id) {
        SqlSession sqlSession = MybatisUtil.openSession();
        Goods goods = sqlSession.selectOne("cn.lyf.mapper.GoodsMapper.selectById", id);
        sqlSession.commit();
        sqlSession.close();
        return goods;
    }

    @Override
    public List<Goods> selectAll() {

        SqlSession sqlSession = MybatisUtil.openSession();
        List<Goods> list = sqlSession.selectList("cn.lyf.mapper.GoodsMapper.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return list;
    }
}
