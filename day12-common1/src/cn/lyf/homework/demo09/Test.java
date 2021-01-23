package cn.lyf.homework.demo09;

/**
 * Date:2021/1/23 19:23
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        String text = "name：移动硬盘;price：58.0";

        String name = text.substring(5, 9);
        String priceStr = text.substring(16, 20);
        Double price = Double.valueOf(priceStr);

        ItemDemo item = new ItemDemo(name,price);

        System.out.println(item);

    }
}
