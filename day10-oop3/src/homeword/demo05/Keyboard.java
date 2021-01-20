package homeword.demo05;

/**
 * Date:2021/1/20 18:57
 * Author:lyf
 */
public class Keyboard implements IUSB {
    @Override
    public void swapData() {
        System.out.println("键盘在敲打");
    }
}
