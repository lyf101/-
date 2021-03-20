package cn.lyf.dao.impl;

import cn.lyf.dao.IProductDAO;
import cn.lyf.domain.Product;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/20 16:13
 * Author:lyf
 */
public class ProductDAOImpl implements IProductDAO {
    @Override
    public void insert(Product product) {
        SqlSession sqlSession = MybatisUtil.openSqlsession();
        sqlSession.insert("cn.lyf.mapper.ProductMapper.insert",product);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSqlsession();
        sqlSession.delete("cn.lyf.mapper.ProductMapper.deleteById", id);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public void update(Product product) {
        SqlSession sqlSession = MybatisUtil.openSqlsession();
        sqlSession.update("cn.lyf.mapper.ProductMapper.update", product);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public Product selectById(Long id){
        SqlSession sqlSession = MybatisUtil.openSqlsession();
        Product product = sqlSession.selectOne("cn.lyf.mapper.ProductMapper.selectById", id);
        return product;
    }

    @Override
    public List<Product> selectAll() {
        SqlSession sqlSession = MybatisUtil.openSqlsession();
        List<Product> products = sqlSession.selectList("cn.lyf.mapper.ProductMapper.selectAll");
        return products;
    }
}
