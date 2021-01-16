package homeWork;

import java.util.Scanner;

public class Demo01 {

    /*定义一个方法(getLeap),传入年份（year），判断传入的年份是否闰年，返回true是闰年，false不是闰年。写一个测试类，测试下2016年是否闰年。
    提示：能被4整除且不能被100整除的为闰年或者能被400整除的是闰年。*/
    public static boolean getLeap(int year) {
        boolean flag = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个年份:");
        int year = sc.nextInt();

        if (getLeap(year)) {
            System.out.println(year + "年是闰年");
        } else System.out.println(year + "年不是闰年");
    }
}
