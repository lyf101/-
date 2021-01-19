package homework.demo07;

/**
 * Date:2021/1/19 19:35
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        SWK swk = new SWK();
        ZBJ zbj = new ZBJ();
        SHS shs = new SHS();

        swk.setName("孙悟空");
        swk.setAge(518);
        swk.setWeapon("金棍棒");
        swk.setFormula("玛尼玛尼哄");

        zbj.setName("猪八戒");
        zbj.setAge(500);
        zbj.setWeapon("九齿钉耙");
        zbj.setWife("高小姐");

        shs.setName("沙和尚");
        shs.setAge(500);
        shs.setWeapon("法杖");
        shs.setSandRiver("流沙河");

        System.out.println(swk.toString());
        System.out.println(zbj.toString());
        System.out.println(shs.toString());
    }
}
