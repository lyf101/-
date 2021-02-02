package day23_24.demo02;

/**
 * Date:2021/2/2 23:05
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        int num = 243;
        int hundred = num / 100;
        int ten = (num / 10) % 10;
        int one = num % 10;
        System.out.println("百位:" + hundred + " 十位：" + ten + " 个位:" + one);
    }
}
