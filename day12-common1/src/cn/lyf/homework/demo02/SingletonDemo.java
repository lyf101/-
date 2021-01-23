package cn.lyf.homework.demo02;

/**
 * Date:2021/1/23 18:37
 * Author:lyf
 */
public class SingletonDemo {

    private static SingletonDemo singletonDemo = new SingletonDemo();

    //1.私有构造方法
    private SingletonDemo() {

    }

    //2.提供唯一的入口
    public SingletonDemo getSingletonDemo() {
        return singletonDemo;
    }

    //3.放入方法
    public static void arrayString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else str += arr[i] + ",";
        }
        System.out.println(str);
    }
}
