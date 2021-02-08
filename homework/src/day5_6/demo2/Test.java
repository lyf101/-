package day5_6.demo2;


/**
 * Date:2021/2/4 19:32
 * Author:lyf
 */
public class Test {
    public static String getLevel(int score){
        int garde = score/10;
        switch (garde){
            case 10:
            case 9:return "优";
            case 8:
            case 7:return "良";
            case 6:return "中";
            default:return "差";
        }
    }

    public static void main(String[] args) {
        System.out.println(getLevel(100));
    }
}
