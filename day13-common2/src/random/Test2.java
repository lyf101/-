package random;

import java.util.Random;

/**
 * Date:2021/1/25 16:06
 * Author:lyf
 */
public class Test2 {
    public static void main(String[] args) {
        //大写小写数字
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] codes = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = r.nextInt(codes.length);
            sb.append(codes[i1]);
        }
        System.out.println(sb);
    }
}
