package homework.demo03;

import java.util.Scanner;

/**
 * Date:2021/2/1 19:54
 * Author:lyf
 */
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("请输入第一个整数:");
        try {
            int a = sc.nextInt();
            System.out.println("请输入第二个整数：");
            int b = sc.nextInt();
            i = a / b;
        } catch (Exception e) {
            System.out.println("出现异常了");
        }finally {
            System.out.println("运行完毕");
        }
        System.out.println(i);
    }

}
