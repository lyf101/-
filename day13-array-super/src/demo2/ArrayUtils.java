package demo2;

import java.sql.SQLOutput;

/**
 * Date:2021/1/27 15:06
 * Author:lyf
 */
public class ArrayUtils {

    public static void swap(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

}
