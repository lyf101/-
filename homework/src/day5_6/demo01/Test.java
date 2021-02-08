package day5_6.demo01;

/**
 * Date:2021/2/4 18:52
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            if(i%2==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
