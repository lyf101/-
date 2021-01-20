package homeword.demo07;

/**
 * Date:2021/1/20 19:58
 * Author:lyf
 */
public class RobootB extends Roboot implements ISee {
    @Override
    public void see() {
        System.out.println("机器人B"+getName()+"图像识别");
    }
}
