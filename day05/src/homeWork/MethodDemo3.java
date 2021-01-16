package homeWork;

public class MethodDemo3 {
    //需求1:定义一个方法getSum,计算两个整数数组的总和
    public static int getSum(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int arr : arr1) {
            sum1 += arr;
        }
        for (int arr : arr2) {
            sum2 += arr;
        }
        return sum1 + sum2;
    }

    //需求2:定义一个方法printArray,按照格式打印数组中非0的元素,例如{1,0,2,3,0,4,5}打印出来应该为`[1,2,3,4,5]`
    public static void printArray(int[] arr) {

        //计算排除零后数组长度
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                length++;
            }
        }
        //重新创建一个数组存储非零元素
        int[] arr1 = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] != 0) {
                    arr1[i] = arr[j];
                    break;
                }
            }
        }

        //打印输出数组
        String str = "[";
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                if (i == arr1.length - 1) {
                    str += arr1[i];
                } else str += arr1[i] + ",";
            }
        }
        System.out.println(str + "]");
    }


    //需求3:定义一个方法getFactorial,求出n!的结果.阶乘公式为`n! = 1*2*...*n`.
    public static int getFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * getFactorial(i - 1);
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 4};
        int[] arr2 = {2, 5, 4, 1};
        int sum = getSum(arr1, arr2);
        System.out.println("两个数组的和为：" + sum);
        System.out.println("---------------------------");


        int[] array = {1, 2, 3, 0, 4, 5, 6, 0, 0};
        printArray(array);
        System.out.println("---------------------------");


        int n = 5;
        System.out.println(n + "的阶乘结果为：" + getFactorial(n));

    }
}
