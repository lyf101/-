package homeword.demo08;

/**
 * Date:2021/1/20 20:12
 * Author:lyf
 */
public class Airliner extends Seater implements IFly {
    @Override
    public void fly() {
        System.out.println("飞机开始飞天了");
    }

    @Override
    public void maned() {
        System.out.println("我是"+getBrand()+"飞机，有载客行为");
    }
}
