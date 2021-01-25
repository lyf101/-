package string1;

/**
 * Date:2021/1/25 9:56
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {

        String str = "hello word";

        System.out.println(str.lastIndexOf("llo"));
        System.out.println(str.lastIndexOf("llo",2));
        System.out.println(str.replace(' ','\u0000'));
    }
}
