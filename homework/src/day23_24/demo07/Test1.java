package day23_24.demo07;

/**
 * Date:2021/2/2 23:23
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        double start = 10000;
        int i = 5;
        while (i > 0) {
            start += start * 0.03;
            i--;
        }
        System.out.println(start);
    }
}
