package homeword.demo04;

/**
 * Date:2021/1/22 18:58
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        new Animal(){
            public void run(){
                System.out.println("狗在跑");
            }
        }.run();

        new IUSB(){
            public void showInfo(){
                System.out.println("键盘");
            }
        }.showInfo();
    }
}
