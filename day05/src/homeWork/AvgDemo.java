package homeWork;

public class AvgDemo {

    /*需求：定义一个方法接收一个 int 类型的二维数组，返回所有元素平均值(int 类型)。

    思路：{{0,1,2}，{3,4}} 结果（0+1+2+3+4）/5 = 2*/
    public static int avg(int[][] arr2) {
        int sum = 0;
        int total = 0;
        for (int[] arr1 : arr2) {
            int arr1Sum = 0;
            for (int i : arr1) {
                arr1Sum += i;
                total++;
            }
            sum += arr1Sum;
        }
        return sum / total;
    }

    public static void main(String[] args) {
        int[][] arrays = {{0, 1, 2}, {3, 4}};
        System.out.println("arrays的所有元素平均数为：" + avg(arrays));
    }

}
