package homeword.demo07;

/**
 * Date:2021/1/20 19:56
 * Author:lyf
 */
public class RobootA extends Roboot implements ISpeak {

    @Override
    public void speak() {
        System.out.println("机器人A"+getName()+"说话");
    }
}
