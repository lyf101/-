package day23_24.demo03;

import java.util.Scanner;

/**
 * Date:2021/2/2 23:10
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入课程编号：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        //ifDemo(i);
        switchDemo(i);



    }

    public static void ifDemo(int i) {
        if (i == 1) {
            System.out.println("java");
        } else if (i == 2) {
            System.out.println("php");
        } else if (i == 3) {
            System.out.println("html");
        } else if (i == 4) {
            System.out.println("ios");
        }else {
            System.out.println("课程编号不存在");
        }
    }

    public static void switchDemo(int i) {
        switch (i){
            case 1:System.out.println("java");break;
            case 2:System.out.println("php");break;
            case 3:System.out.println("html");break;
            case 4:System.out.println("ios");break;
            default:System.out.println("课程编号不存在");
        }
    }
}
