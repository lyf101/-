package day5_6.demo5;

/**
 * Date:2021/2/4 19:57
 * Author:lyf
 */
public class Test {
    public static int[] combineArrays(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length+arr2.length];
        for (int i = 0;i<arr1.length;i++){
            newArr[i] = arr1[i];
        }
        for (int i = 0;i<arr2.length;i++){
            newArr[arr1.length+i] = arr2[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1={1,2},arr2={3,4};
        int[] newArr = combineArrays(arr1, arr2);
        for (int i : newArr){
            System.out.print(i+" ");
        }
    }
}
