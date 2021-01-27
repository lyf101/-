package homework.demo04;

import java.util.Arrays;

/**
 * Date:2021/1/27 18:48
 * Author:lyf
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {

        int[] src = {10, 20, 30, 40, 50, 60};
        int[] dest;

        int index = 2;
        int tag = 4;
        int length = 4;
        dest = new int[tag + length];

        for (int i = 0; i < length; i++) {
            /*if (i > src.length - 1 - index) {
                dest[tag + i] = 0;
            } else {*/
                dest[tag + i] = src[i + index];
            //}
        }

        System.out.println(Arrays.toString(dest));

        System.arraycopy(src, 2, dest, 4, 4);
        System.out.println(Arrays.toString(dest));
    }
}
