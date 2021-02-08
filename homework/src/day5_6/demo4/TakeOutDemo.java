package day5_6.demo4;

/**
 * Date:2021/2/4 19:51
 * Author:lyf
 */
public class TakeOutDemo {
    public static int[] takeOutZero(int[] arr){

        int len = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                len++;
            }
        }

        int[] newArr = new int[len];
        int idx = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                newArr[idx++]=arr[i];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
        int[] newArr = takeOutZero(arr);
        for(int i:newArr){
            System.out.print(i+" ");
        }

    }
}
