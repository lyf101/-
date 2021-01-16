package homeWork;

import java.util.Scanner;

public class Demo06 {

    /*一个n位数，判断它是不是回文数。例如：12321是回文数，个位与万位相同，十位与千位相同。*/
    public static boolean huiWen(int num) {
        int hui = 0;
        int mid = num;
        while (mid > 10) {
            hui = hui + mid % 10;
            mid = mid / 10;
            hui = hui * 10;
        }
        hui = hui + mid;

        return num == hui;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        if (huiWen(num)) {
            System.out.println(num + "是回文数");
        } else System.out.println(num + "不是回文数");
    }
}
