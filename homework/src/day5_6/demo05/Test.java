package day5_6.demo05;

/**
 * Date:2021/2/4 19:09
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = new int[2];

        for (int i = 0;i<arr.length;i++){
            if (i%2==0){
                newArr[0]+=arr[i];
            }else newArr[1]+=arr[i];
        }
        System.out.println(newArr[0]+","+newArr[1]);
    }
}
