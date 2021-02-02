package day23_24.demo10;

/**
 * Date:2021/2/2 23:35
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;
            if (i == Math.pow(hun, 3) + Math.pow(ten, 3) + Math.pow(one, 3)) {
                System.out.println(i);
            }
        }
    }
}
