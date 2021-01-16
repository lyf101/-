package homeWork;

import java.util.Scanner;

public class Demo05 {
    /*验证“鬼谷猜想”：对任意自然数num，若是奇数，就对它乘以 3 再加 1；若是偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进行下去，最终num为1的时候不再运算，求出num为1时共循环了几次。
    例如：num = 10偶数，除以2后num为5奇数，乘以3+1 num为16...*/
    public static int guigu(int num) {
        int how = 0;
        while (num != 1) {
            if (num % 2 == 1) {
                num = num * 3 + 1;
            } else num /= 2;
            how++;
        }
        return how;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个自然数:");
        int num = sc.nextInt();
        int how = guigu(num);
        System.out.println("共循环了" + how + "次");
    }
}
