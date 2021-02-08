package day3_4.demo06;

/**
 * Date:2021/2/2 23:20
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;
        while (i > 0) {
            if (i % 3 != 0) {
                sum += i;
            }
            i--;
        }
        System.out.println(sum);
    }
}
