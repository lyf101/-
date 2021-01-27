package homework.demo002;

import java.util.Arrays;

/**
 * Date:2021/1/27 19:36
 * Author:lyf
 */
public class ChangeDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        transfer(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void transfer(int[] arr,int index1 ,int index2) {
        int i = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = i;

    }

}
