package cn.lyf.dao;

import cn.lyf.dao.impl.StrategycommentDAOImpl;
import cn.lyf.domain.Strategycomment;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/13 19:39
 * Author:lyf
 */
public class IStrategycommentDAOTest {

    private IStrategycommentDAO strategycommentDAO = new StrategycommentDAOImpl();

    @Test
    public void insert() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date createDate = sdf.parse("1997-10-13");
        Date commendTime = sdf.parse("2021-2-23");
        Strategycomment strategycomment = new Strategycomment(null,35L,createDate,"那就这样","www.baidu.com",2,2L,2,commendTime);
        strategycommentDAO.insert(strategycomment);
    }

    @Test
    public void deleteById() {
        strategycommentDAO.deleteById(2L);
    }

    @Test
    public void update() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date createDate = sdf.parse("1997-10-13");
        Date commentTime = sdf.parse("2021-2-23");
        Strategycomment strategycomment = new Strategycomment(3L,35L,createDate,"foller","www.bilibili.com",2,2L,2,commentTime);
        strategycommentDAO.update(strategycomment);
    }

    @Test
    public void selectById() {
        Strategycomment strategycomment = strategycommentDAO.selectById(3L);
        System.out.println(strategycomment);
    }

    @Test
    public void selectAll() {
        List<Strategycomment> list = strategycommentDAO.selectAll();
        list.forEach(System.out::println);
    }
}