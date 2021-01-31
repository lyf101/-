package demo01;

import java.util.Scanner;

/**
 * Date:2021/1/31 10:59
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");

        int r = 0;
         try {
             int num1 = sc.nextInt();
             System.out.println("请输入第二个整数:");
             int num2 = sc.nextInt();
             r = num1 / num2;
         }catch (Exception e){
             System.out.println("出问题了");
         }
        System.out.println(r);
    }
}
