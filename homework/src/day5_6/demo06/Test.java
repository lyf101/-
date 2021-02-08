package day5_6.demo06;

/**
 * Date:2021/2/4 19:13
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2}, {0,3}};
        zeroNum(arr);

    }

    public static void zeroNum(int[][] arr) {
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j] == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
