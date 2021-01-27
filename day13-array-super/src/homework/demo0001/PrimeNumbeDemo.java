package homework.demo0001;

import java.util.Arrays;

/**
 * Date:2021/1/27 19:41
 * Author:lyf
 */
public class PrimeNumbeDemo {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int idx = 0;
        boolean flag = true;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                } else flag = true;
            }
            if (flag == true) {
                idx = idx % 5;
                arr[idx] = i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
