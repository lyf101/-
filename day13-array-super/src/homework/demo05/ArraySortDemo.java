package homework.demo05;

import java.util.Arrays;

/**
 * Date:2021/1/27 19:16
 * Author:lyf
 */
public class ArraySortDemo {

    public static void main(String[] args) {
        int[] arr = {2, 4, 61, 23, 5, 2, 7, 22};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 1, 2, 5, 85, 37, 8, 3, 5,};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void sort(int[] arr, int key) {
        if (key == arr.length - 2) {
            return;
        }
        key++;
        for (int i = 0; i < arr.length - key; i++) {
            if (arr[i] > arr[i + 1]) {
                int tem = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tem;
            }
        }
        sort(arr, key);
    }
}
