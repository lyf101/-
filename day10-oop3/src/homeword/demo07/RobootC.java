package homeword.demo07;

/**
 * Date:2021/1/20 19:59
 * Author:lyf
 */
public class RobootC extends Roboot implements ISpeak,ISee {
    @Override
    public void see() {
        System.out.println("机器人C"+getName()+"会说话");
    }

    @Override
    public void speak() {
        System.out.println("机器人C"+getName()+"图文识别");
    }
}
