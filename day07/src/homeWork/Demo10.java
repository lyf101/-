package homeWork;

import java.util.Scanner;

public class Demo10 {
    /*将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。*/
    public static String printZhiShu(int num) {
        String str = num + "=";
        while (!Demo09.zhiShu(num)) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0 && Demo09.zhiShu(i)) {
                    str += i + "*";
                    num = num / i;
                    break;
                }
            }
        }
        str += num;
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        System.out.println("该正整数的质因数为:" + printZhiShu(num));
    }
}
