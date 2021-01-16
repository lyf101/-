package homeWork;

public class MethodDemo2 {
    /*需求1：定义一个方法，打印指定多少行的指定字符串

    步骤：

            （1）定义方法

            （2）实现方法体

            （3）调用方法*/
    public static void printStr(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

   /* 需求2：定义一个方法，传入一个int数组，按照格式打印int类型数组

    步骤：

            （1）定义方法

            （2）实现方法体

            （3）调用方法*/

    public static void printArray(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else str += arr[i] + ",";
        }
        System.out.println(str);
    }


    /*需求3：定义一个方法，传入一个int数组，返回指定元素在数组中第一次出现的索引

    步骤：

            （1）定义方法

            （2）实现方法体*/
    public static int indexOf(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //需求1：定义一个方法，打印指定多少行的指定字符串
        int n1 = 5;
        String str1 = "*****";
        printStr(str1, n1);
        System.out.println("----------------------");


        //需求2：定义一个方法，传入一个int数组，按照格式打印int类型数组
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        printArray(arr2);
        System.out.println("----------------------");


        //需求3：定义一个方法，传入一个int数组，返回指定元素在数组中第一次出现的索引
        int[] arr3 = {5, 4, 1, 8, 6, 2, 3};
        int index = 8;
        if (indexOf(arr3, index) < 0) {
            System.out.println("没有找到");
        } else
            System.out.println("找到" + index + "索引为：" + indexOf(arr3, index));
    }


}
