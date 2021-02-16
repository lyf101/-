package day15_16.demo04;

import java.util.Scanner;

/**
 * Date:2021/2/16 11:35
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (int i = 0;i<chars.length/2;i++){
            if(chars[i] != chars[chars.length-1-i]){
                flag = false;
            }
        }
        System.out.println(flag);
    }

}
