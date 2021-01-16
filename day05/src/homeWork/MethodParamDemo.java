package homeWork;

public class MethodParamDemo {
    /*需求：演示基本数据类型值传递机制和引用数据类型值传递机制的区别

    步骤：

            （1）基本数据类型的值传递机制
            定义一个方法，改变一个基本类型变量的值

            （2）引用数据类型值传递机制
            定义一个方法，改变一个数组中的一个元素的值

            （3）调用方法，并观察值之间的区别

            （4）请画出基本类型值传递的内存分析图

            （5）请画出引用类型值传递的内存分析图*/

    public static void change(int i) {
        i = 100;
    }

    public static void change(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int a = 1;
        int[] array = {0, 1, 2};
        change(a);
        change(array);
        System.out.println("a=" + a);
        System.out.println("array[0]=" + array[0]);
    }
}
