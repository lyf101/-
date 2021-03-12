package cn.lyf.dao;

import cn.lyf.domain.Goods;

import java.util.List;

/**
 * Date:2021/3/12 10:18
 * Author:lyf
 */
public interface IGoodsDAO {

    void insert(Goods goods);
    void deleteById(int id);
    void update(Goods goods);
    Goods selectById(int id);
    List<Goods> selectAll();
}
