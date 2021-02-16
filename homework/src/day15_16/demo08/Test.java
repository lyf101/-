package day15_16.demo08;

import java.util.Scanner;

/**
 * Date:2021/2/16 12:46
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")){
            System.out.println("是邮箱");
        }else System.out.println("不是邮箱");
    }
}
