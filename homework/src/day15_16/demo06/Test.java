package day15_16.demo06;

import java.util.Scanner;

/**
 * Date:2021/2/16 12:02
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();

        String newStr = "";
        for (int i = 0;i<chars.length;i++){
            if(i == 3||i==7){
                newStr+="-";
            }
            newStr+=chars[i];
        }
        System.out.println(newStr);
    }
}
