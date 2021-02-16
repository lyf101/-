package day15_16.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * Date:2021/2/16 11:17
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = str.toCharArray();
        Random random = new Random();
        char[] code = new char[4];
        for (int i = 0;i<4;i++){
            int index = random.nextInt(chars.length-1);
            code[i] = chars[index];
        }

        String strCode = "";
        for(char c : code){
            strCode+=c;
        }
        System.out.println("验证码为："+strCode);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals(strCode)){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }
    }
}
