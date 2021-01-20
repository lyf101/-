package homeword.demo08;

/**
 * Date:2021/1/20 20:11
 * Author:lyf
 */
public class Taxi extends Seater implements IRun {
    @Override
    public void run() {
        System.out.println("出租车开始跑了");
    }

    @Override
    public void maned() {
        System.out.println("我是大众"+getBrand()+"出租车，有载客行为");
    }
}
