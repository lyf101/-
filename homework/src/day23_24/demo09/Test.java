package day23_24.demo09;

/**
 * Date:2021/2/2 23:31
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
