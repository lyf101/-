package day3_4.demo11;

/**
 * Date:2021/2/2 23:42
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100 - i; j++) {
                for (int k = 0; k <= 100 - i - j; k++) {
                    if (i * 5 + j * 3 + k * (1.0 / 3) == 100 && i + j + k == 100) {
                        System.out.println("公鸡：" + i + "只，母鸡：" + j + "只，雏鸡:" + k + "只");
                    }
                }
            }
        }
    }
}
