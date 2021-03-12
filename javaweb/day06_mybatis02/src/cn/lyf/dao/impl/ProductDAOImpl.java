package cn.lyf.dao.impl;

import cn.lyf.dao.IProductDAO;
import cn.lyf.domain.Product;
import cn.lyf.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Date:2021/3/11 20:41
 * Author:lyf
 */
public class ProductDAOImpl implements IProductDAO {
    @Override
    public void insert(Product product) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.insert("cn.lyf.mapper.ProductMapper.insert",product);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(Long id) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.delete("cn.lyf.mapper.ProductMapper.deleteById",id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Product product) {
        SqlSession sqlSession = MybatisUtil.openSession();
        sqlSession.update("cn.lyf.mapper.ProductMapper.update",product);
        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public Product selectById(Long id) {

        SqlSession sqlSession = MybatisUtil.openSession();
        Product product = sqlSession.selectOne("cn.lyf.mapper.ProductMapper.selectById", id);
        sqlSession.commit();
        sqlSession.close();
        return product;
    }

    @Override
    public List<Product> selectAll() {

        SqlSession sqlSession = MybatisUtil.openSession();
        List<Product> products = sqlSession.selectList("cn.lyf.mapper.ProductMapper.selectAll");
        sqlSession.commit();
        sqlSession.close();
        return products;
    }
}
