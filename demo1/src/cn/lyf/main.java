package cn.lyf;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的元素索引：");
        int i = sc.nextInt();
        for (int j = 0; j<arr.length;j++){
            if(j==i){
                for(;j<arr.length-1;j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length-1] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
