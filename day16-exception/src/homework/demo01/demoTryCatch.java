package homework.demo01;

import java.util.Scanner;

/**
 * Date:2021/2/1 19:46
 * Author:lyf
 */
public class demoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            System.out.println("请输入第一个整数:");
            int a = sc.nextInt();
            System.out.println("请输入第二个整数：");
            int b = sc.nextInt();
            i = a / b;
        } catch (Exception e) {
            System.out.println("出现异常了");
        }
        System.out.println(i);
    }
}
