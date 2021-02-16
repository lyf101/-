package day15_16.demo02;

/**
 * Date:2021/2/16 11:08
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abcuqwejndaauabcnsdaswjabcsjdqabc";
        int num = 0;
        if(b.endsWith(a)){
            num++;
        }
        String[] split = b.split(a);
        num += split.length-1;
        System.out.println(num);
    }
}
