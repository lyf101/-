package cn.lyf.dao;

import cn.lyf.domain.Good;

import java.util.List;

/**
 * Date:2021/3/13 18:44
 * Author:lyf
 */
public interface IGoodDAO {
    void insert (Good good);
    void deleteById(Long id);
    void update(Good good);
    Good selectById(Long id);
    List<Good> selectAll();
}
