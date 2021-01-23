package cn.lyf.demo1.bigdecimal1;

import java.math.BigDecimal;

/**
 * Date:2021/1/23 16:47
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.01");
        BigDecimal b2 = new BigDecimal("0.09");

        BigDecimal r2 = b1.add(b2);

        System.out.println(r2);
    }
}
