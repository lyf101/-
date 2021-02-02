package homework.demo02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Date:2021/2/1 19:49
 * Author:lyf
 */
public class TryCatchCatchDemo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = 0;
            System.out.println("请输入第一个整数:");
            try {
                int a = sc.nextInt();
                System.out.println("请输入第二个整数：");
                int b = sc.nextInt();
                i = a / b;
            } catch (InputMismatchException e) {
                System.out.println("请正确输入一个整数");
            }catch (ArithmeticException e){
                System.out.println("除数不能为零");
            }

            System.out.println("结尾");
    }
}
