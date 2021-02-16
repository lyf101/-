package day15_16.demo09;

import java.util.Scanner;

/**
 * Date:2021/2/16 12:51
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.matches("1[3-9][0-9]{9}")){
            System.out.println("是");
        }else System.out.println("否");
    }
}
