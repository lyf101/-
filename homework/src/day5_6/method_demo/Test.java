package day5_6.method_demo;

/**
 * Date:2021/2/4 19:24
 * Author:lyf
 */
public class Test {
    public static void method1(){

    }
    public static void method2(int a){

    }
    public static void method3(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public static int sum1(int a,int b){
        return a+b;
    }
    public static String concat(int a,String str){
        return str+a;
    }
    public static void printRectangle(int n,int m){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int printRectangle2(int n,int m){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 2*(n+m);
    }

    public static void main(String[] args) {
        printRectangle(3,8);
        int i = printRectangle2(3, 8);
        System.out.println(i);
    }
}
