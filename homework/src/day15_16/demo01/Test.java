package day15_16.demo01;


import java.util.Scanner;

/**
 * Date:2021/2/16 11:00
 * Author:lyf
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int other=0;
        int strnums=0;
        int number=0;
        int knum = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65&&c<=90){
                strnums++;
            }else if(c>=97&&c<=122){
                strnums++;
            } else if (c==' '){
                knum++;
            } else if(c>=48&&c<=57){
                number++;
            }else{
                other++;
            }
        }
        System.out.println("字母:"+strnums);
        System.out.println("数字:"+number);
        System.out.println("空格:"+knum);
        System.out.println("其他:"+other);

    }

}
