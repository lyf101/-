package day5_6.demo03;

/**
 * Date:2021/2/4 18:55
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        String[] arr = {"A","B","C"};
        arrToString(arr);
    }

    public static void arrToString(String[] arr) {
        String str = "[";
        for (int i = arr.length-1;i>=0;i--){
            str = i==0?(str+arr[i]+"]"):(str + arr[i]+",");
        }
        System.out.println(str);
    }
}
