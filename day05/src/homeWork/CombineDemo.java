package homeWork;

public class CombineDemo {

    /*需求：定义一个名为combineArrays的方法，以两个int类型的数组arr1和arr2作为参数，实现将arr1和arr2两个数组合并为一个新的一维数组，并返回合并后的新数组。

    例如：arr1={1,2},arr2={3,4}，则该方法应该返回{1,2,3,4}。

    思路：

            （1）先求出符合要求的元素个数

            （2）创建一个新的数组存放符合要求的元素

            （3）将符合要求的元素存放到新的数组中*/

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = i; j < arr1.length; j++) {
                arr[i] = arr1[j];
                break;
            }
            if (i >= arr1.length) {
                for (int k = i; k < arr1.length + arr2.length; k++) {
                    arr[i] = arr2[k - arr1.length];
                    break;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] array = combineArrays(arr1, arr2);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
