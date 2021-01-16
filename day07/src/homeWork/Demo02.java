package homeWork;

import java.util.Scanner;

public class Demo02 {

    /* 给定某年某月某日，判断这一天是这一年的第几天？
     程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
     闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数。*/
    public static int howDay(int year, int month, int day) {
        int sumDay = 0;
        if (Demo01.getLeap(year)) {
            switch (month) {
                case 1:
                    sumDay = 31;
                    break;
                case 2:
                    sumDay = 31 + 29;
                    break;
                case 3:
                    sumDay = 31 + 29 + 31;
                    break;
                case 4:
                    sumDay = 31 + 29 + 31 + 30;
                    break;
                case 5:
                    sumDay = 31 + 29 + 31 + 30 + 31;
                    break;
                case 6:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30;
                    break;
                case 7:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31;
                    break;
                case 8:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case 9:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case 10:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                case 11:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                    break;
                case 12:
                    sumDay = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                    break;
            }
        } else {
            switch (month) {
                case 1:
                    sumDay = 31;
                    break;
                case 2:
                    sumDay = 31 + 28;
                    break;
                case 3:
                    sumDay = 31 + 28 + 31;
                    break;
                case 4:
                    sumDay = 31 + 28 + 31 + 30;
                    break;
                case 5:
                    sumDay = 31 + 28 + 31 + 30 + 31;
                    break;
                case 6:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30;
                    break;
                case 7:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                    break;
                case 8:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case 9:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case 10:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                case 11:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                    break;
                case 12:
                    sumDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                    break;
            }

        }
        return sumDay + day;
    }


    public static void main(String[] args) {
        int year;
        int month;
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要计算的年：");
        year = sc.nextInt();
        System.out.println("请输入要计算的月：");
        month = sc.nextInt();
        System.out.println("请输入要计算的日：");
        day = sc.nextInt();

        System.out.println(year + "年" + month + "月" + day + "日是该年的第：" + howDay(year, month, day) + "天");
    }

}
