package homeWork;

import java.util.Scanner;

public class Demo03 {

    /*使用switch编写程序，给定一个学生成绩，给出相应等级：
            (1)	90~100 优秀
            (2)	80~89 良好
            (3)	70~79 中等
            (4)	60~69 及格
            (5)	0~59 不及格*/
    public static void result(int grade) {
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入判定的分数：");
        int grade = scanner.nextInt();
        result(grade);
    }
}
