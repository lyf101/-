package demo04;

/**
 * Date:2021/1/20 15:44
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        ISwimable swimable = null;

        swimable = new Person();
        swimable.swim();

        swimable = new Fish();
        swimable.swim();
    }
}
