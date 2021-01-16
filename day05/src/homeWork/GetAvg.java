package homeWork;

public class GetAvg {
    /*2.定义一个方法getAvg, 求出某个数组去掉最大值和最小值之后的平均分.

           思路：

           1. 遍历数组，求得最大值和最小值

           2. 重新遍历数组，统计不等于最大值也不等于最小值的元素的和和个数

           3. 计算平均分并返回*/
    public static double getAvg(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (double i : arr) {
            sum += i;
        }
        return (sum - max - min) / (arr.length - 2);
    }

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println("array去掉最高和最低的平均分为：" + getAvg(array));
    }
}
