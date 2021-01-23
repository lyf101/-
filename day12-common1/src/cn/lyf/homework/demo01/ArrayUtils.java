package cn.lyf.homework.demo01;

/**
 * Date:2021/1/23 18:33
 * Author:lyf
 */
public class ArrayUtils {

    public static void arrayString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else str += arr[i] + ",";
        }
        System.out.println(str);
    }
}
