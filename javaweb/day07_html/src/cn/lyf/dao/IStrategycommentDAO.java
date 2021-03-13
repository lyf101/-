package cn.lyf.dao;

import cn.lyf.domain.Strategycomment;

import java.util.List;

/**
 * Date:2021/3/13 19:34
 * Author:lyf
 */
public interface IStrategycommentDAO {
    void insert(Strategycomment strategycomment);
    void deleteById(Long id);
    void update(Strategycomment strategycomment);
    Strategycomment selectById(Long id);
    List<Strategycomment> selectAll();

}
