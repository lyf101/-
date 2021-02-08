package day7_9.demo10;

/**
 * Date:2021/2/8 12:22
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Invest invest = new Invest() {
            @Override
            public void success() {
                System.out.println("充值成功");
            }
        };
        invest.success();
    }
}
