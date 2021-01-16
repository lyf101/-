package homeWork;

public class Demo08 {
    /*定义一个正整数的数组arr，删除arr数组中指定索引的元素，删除元素后面的元素需要往前移动，并且最后的索引位置用-1补上。如下图所示：*/
    public static int[] delete(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (i == key) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = -1;
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int key = 0;
        int[] array = delete(arr, key);
        System.out.print("删除后数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
