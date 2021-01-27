package demo3;

import java.util.Arrays;

/**
 * Date:2021/1/27 15:54
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = ArrayUtils.binarySearch(arr, 4);
        System.out.println(i);

        int[] arr1 = {1,3,5,7,9};
        int i1 = Arrays.binarySearch(arr1, 5);
        System.out.println(i1);
    }
}
