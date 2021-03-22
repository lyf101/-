package cn.lyf.dao;

import cn.lyf.domain.Product;

import java.util.List;

/**
 * Date:2021/3/20 16:11
 * Author:lyf
 */
public interface IProductDAO {

    void insert(Product product);
    void deleteById(Long id);
    void update(Product product);
    Product selectById(Long id);
    List<Product> selectAll();
}
