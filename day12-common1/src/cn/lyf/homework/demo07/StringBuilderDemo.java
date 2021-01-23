package cn.lyf.homework.demo07;

/**
 * Date:2021/1/23 19:06
 * Author:lyf
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuilder efg = stringBuilder.append("efg");
        System.out.println(efg);
    }
}
