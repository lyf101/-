package test;

public class Demo06Method {


    /*构成重载
        1.同一类
        2.相同方法名
        3.参数不同（顺序，类型，数量）
     */
    public static void main(String[] args) {

        int a=10;
        int[] arr = {0,1,2};
        change(arr);
        System.out.println(arr[0]);

    }

    public static void change(int a) {
        a = 100;
    }

    public static void change(int[] array){
        array[0] = 100;
    }

}
