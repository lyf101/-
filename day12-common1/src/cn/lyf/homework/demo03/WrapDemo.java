package cn.lyf.homework.demo03;

/**
 * Date:2021/1/23 18:41
 * Author:lyf
 */
public class WrapDemo {

    public static void main(String[] args) {
        int t1 = 10;
        Integer i1 = Integer.valueOf(t1);

        String str2 = Integer.toString(t1);
        int t2 = Integer.parseInt(str2);

        Integer i3 = Integer.valueOf(t1);
        String str3 = Integer.toString(i3);

        System.out.println(i1);
        System.out.println(t2);
        System.out.println(str3);

    }
}
