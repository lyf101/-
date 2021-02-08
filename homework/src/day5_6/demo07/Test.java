package day5_6.demo07;

/**
 * Date:2021/2/4 19:19
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2}, {0,3}};
        avg(arr);
    }

    public static void avg(int[][] arr) {
        int sum = 0;
        int num = 0;

        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                sum += arr[i][j];
                num++;
            }
        }
        System.out.println(sum/num);
    }
}
