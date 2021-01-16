package cn.lyf;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        System.out.println("请输入一个自然数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("共循环"+guigu(num,0)+"次");

    }

    static int guigu(int num,int i){
        if(num==1){
            return i;
        }
        if(num%2==1){
            num = num*3+1;
        }else {
            num = num/2;
        }
        i++;
        return guigu(num,i);
    }
}
