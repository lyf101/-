package homeword.demo05;

/**
 * Date:2021/1/20 18:56
 * Author:lyf
 */
public class Mouse implements IUSB {

    @Override
    public void swapData() {
        System.out.println("鼠标在移动");
    }
}
