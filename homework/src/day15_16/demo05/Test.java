package day15_16.demo05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Date:2021/2/16 11:52
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        String newStr = "";
        for (char c : chars){
            newStr += c;
        }
        System.out.println(newStr);
    }
}
