package random;

import java.util.Random;

/**
 * Date:2021/1/25 15:58
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(5);
        System.out.println(i);

        String str = "abc";
        char[] chars = str.toCharArray();
    }
}
