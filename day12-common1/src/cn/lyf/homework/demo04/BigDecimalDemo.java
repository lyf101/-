package cn.lyf.homework.demo04;

import java.math.BigDecimal;

/**
 * Date:2021/1/23 18:47
 * Author:lyf
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("0.1");
        BigDecimal add = b1.add(b2);
        System.out.println(add);


        BigDecimal multiply = b1.multiply(b2);
        System.out.println(multiply);
    }
}
