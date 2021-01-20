package homeword.demo05;

/**
 * Date:2021/1/20 18:59
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();
        motherBoard.plugin(new Keyboard());
        motherBoard.plugin(new Mouse());
    }
}
