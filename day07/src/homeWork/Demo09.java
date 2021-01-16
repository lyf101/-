package homeWork;

import java.util.Scanner;

public class Demo09 {
    /*9、定义一个方法，判断某个整数是否为质数
    提示:如果一个数只能被1和它本身整除,那么它就是质数
    */
    public static boolean zhiShu(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (zhiShu(num)) {
            System.out.println(num + "是质数");
        } else System.out.println(num + "不是质数");
    }
}
