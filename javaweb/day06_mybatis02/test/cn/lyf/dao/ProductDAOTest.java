package cn.lyf.dao;

import cn.lyf.dao.impl.ProductDAOImpl;
import cn.lyf.domain.Product;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/11 20:49
 * Author:lyf
 */
public class ProductDAOTest {

    private IProductDAO productDAO = new ProductDAOImpl();

    @Test
    public void insert() {
        Product product = new Product();
        product.setBrand("剑圣");
        product.setCostPrice(99.9);
        product.setCutoff(0.4);
        product.setDir_id(1L);
        product.setProductName("剑圣鼠标G900");
        product.setSalePrice(3232.0);
        product.setSupplier("剑圣");
        productDAO.insert(product);
    }

    @Test
    public void deleteById() {
        productDAO.deleteById(4L);
    }

    @Test
    public void update() {
        Product product = new Product();
        product.setBrand("无极");
        product.setCostPrice(99.9);
        product.setCutoff(0.4);
        product.setDir_id(1L);
        product.setProductName("剑圣鼠标G900");
        product.setSalePrice(3232.0);
        product.setSupplier("无极");
        product.setId(2L);
        productDAO.update(product);
    }

    @Test
    public void selectById() {
        Product product = productDAO.selectById(6L);
        System.out.println(product);
    }

    @Test
    public void selectAll() {
        List<Product> products = productDAO.selectAll();
        products.forEach(System.out::println);
    }
}