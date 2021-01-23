package cn.lyf.homework.demo06;

/**
 * Date:2021/1/23 18:58
 * Author:lyf
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "abc";

        //转字符数组
        char[] chars = str.toCharArray();
        System.out.println(chars);
        //是否相等
        boolean equals = str.equals("");
        System.out.println(equals);
        //长度
        int length = str.length();
        System.out.println(length);
        //字符串
        String string = str.toString();
        System.out.println(string);
        //第索引位字符
        char c = str.charAt(1);
        System.out.println(c);
        //比较大小
        int acb = str.compareTo("acb");
        System.out.println(acb);
        //拼接字符
        String ab = str.concat("ab");
        System.out.println(ab);
        //查索引
        int index = str.indexOf("c");
        System.out.println(index);
        //分割字符串
        String[] bs = str.split("b");
        for(String s : bs){
            System.out.print(s+"  ");
        }
    }

}
