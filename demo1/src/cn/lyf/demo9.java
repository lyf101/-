package cn.lyf;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(zhiShu(i)){
            System.out.println(i+"是质数");
        }else {
            System.out.println(i+"不是质数");
        }

    }

    static boolean zhiShu(int i){
        boolean flag = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                flag = false;
            }
        }
        return flag;
    }

}
