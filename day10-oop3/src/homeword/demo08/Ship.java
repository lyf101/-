package homeword.demo08;

/**
 * Date:2021/1/20 20:13
 * Author:lyf
 */
public class Ship extends Seater implements ISwim {
    @Override
    public void swim() {
        System.out.println("船舶开始在海洋中漂流了");
    }

    @Override
    public void maned() {
        System.out.println("我是"+getBrand()+",有载客行为");
    }
}
