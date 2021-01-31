package demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Date:2021/1/31 11:35
 * Author:lyf
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");

        int r = 0;
        try {
            int num1 = sc.nextInt();
            System.out.println("请输入第二个整数:");
            int num2 = sc.nextInt();
            r = num1 / num2;
        }catch (InputMismatchException e){
            System.out.println("输入格式有问题，请输入整数");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        } catch (Exception e){
            System.out.println("未知错误");
        }
        System.out.println(r);
    }
}
