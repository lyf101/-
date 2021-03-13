package cn.lyf.dao;

import cn.lyf.dao.impl.GoodDAOImpl;
import cn.lyf.domain.Good;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Date:2021/3/13 18:57
 * Author:lyf
 */
public class IGoodDAOTest {

    private IGoodDAO goodDAO = new GoodDAOImpl();

    @Test
    public void insert() throws ParseException {
        Good good = new Good();
        good.setProductName("红牛");
        good.setDirName("饮料");
        good.setCostPrice(new BigDecimal(111));
        good.setCutoff(new BigDecimal(0));
        good.setSalePrice(new BigDecimal(150));
        good.setSupplier("运动场");
        good.setBrand("红牛");
        good.setPlace("牛");
        good.setSellingPoint("国内");
        good.setPeriod("六个月");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2011-12-22");
        good.setProductDate(parse);
        good.setStorage("冷藏");
        goodDAO.insert(good);

    }

    @Test
    public void deleteById() {
        goodDAO.deleteById(2L);
    }

    @Test
    public void update() throws ParseException {
        Good good = new Good();
        good.setProductName("黑牛");
        good.setDirName("饮料");
        good.setCostPrice(new BigDecimal(111));
        good.setCutoff(new BigDecimal(0));
        good.setSalePrice(new BigDecimal(150));
        good.setSupplier("运动场");
        good.setBrand("红牛");
        good.setPlace("牛");
        good.setSellingPoint("国内");
        good.setPeriod("六个月");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2011-12-22");
        good.setProductDate(parse);
        good.setStorage("冷藏");
        good.setId(3L);
        goodDAO.update(good);
    }

    @Test
    public void selectById() {
        Good good = goodDAO.selectById(3L);
        System.out.println(good);

    }

    @Test
    public void selectAll() {
        List<Good> list = goodDAO.selectAll();
        list.forEach(System.out::println);
    }
}