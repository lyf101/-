package demo1;

/**
 * Date:2021/1/27 11:46
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2 = new int[10];

        ArrayUtils.arraycopy(arr1,2,arr2,3,3);

        for (int item:arr1){
            System.out.print(item+" ");
        }
        System.out.println();
        for (int item:arr2){
            System.out.print(item+" ");
        }
    }
}
