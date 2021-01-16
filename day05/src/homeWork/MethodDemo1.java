package homeWork;

public class MethodDemo1 {
    /* 需求：定义求两个整数之和的方法
     （1）定义方法

 ​			确定方法名，修饰符（暂时使用static）

             ​			确定是否需要形式参数

 ​			确定是否需要返回

     （2）调用方法

 ​			确定调用语法（暂时类名调用方法）

             ​			确定需要传入什么实际参数

 ​			确定是否需要定义变量接收返回值*/
    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        System.out.println(add(i, j));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
