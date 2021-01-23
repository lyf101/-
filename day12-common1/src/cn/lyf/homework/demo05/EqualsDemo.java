package cn.lyf.homework.demo05;

/**
 * Date:2021/1/23 18:52
 * Author:lyf
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "";
        String str4 = null;
        System.out.println(str3.equals(""));
        System.out.println(str4 == null);
    }
}
