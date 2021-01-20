package demo02;

/**
 * Date:2021/1/20 11:33
 * Author:lyf
 */
public class forg extends Animal implements ISwimable,IWalkable {

    @Override
    public void sleep() {
        System.out.println("forg睡觉");
    }

    @Override
    public void swim() {
        System.out.println("forg游泳");
    }

    @Override
    public void walk() {
        System.out.println("forg步行");
    }
}
