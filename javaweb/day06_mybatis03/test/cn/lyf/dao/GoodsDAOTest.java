package cn.lyf.dao;

import cn.lyf.dao.impl.GoodsDAOImpl;
import cn.lyf.domain.Goods;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/12 10:24
 * Author:lyf
 */
public class GoodsDAOTest {

    private IGoodsDAO goodsDAO = new GoodsDAOImpl();

    @Test
    public void insert() {
        Goods goods = new Goods();
        goods.setDetail("农夫山泉有点甜");
        goods.setName("农夫山泉");
        goods.setPrice(89);
        goodsDAO.insert(goods);
    }

    @Test
    public void deleteById() {
        goodsDAO.deleteById(10);
    }

    @Test
    public void update() {
        Goods goods = new Goods();
        goods.setDetail("红牛，为运动而生");
        goods.setName("红牛");
        goods.setPrice(6);
        goods.setId(1);
        goodsDAO.update(goods);
    }

    @Test
    public void selectById() {
        Goods goods = goodsDAO.selectById(1);
        System.out.println(goods);
    }

    @Test
    public void selectAll() {
        List<Goods> goods = goodsDAO.selectAll();
        goods.forEach(System.out::println);
    }
}