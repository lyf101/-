package homeWork.demo05;

/**
 * Date:2021/1/16 18:59
 * Author:lyf
 */
public class SunWukong {
    /**
     * **孙悟空类**
     *
     * **字段：**name，age，武器(weapon)，紧箍咒(formula)
     *
     * **方法：**吃斋(doMaigre)，念佛(buddha)，取经(doPilgrimage)，战斗(fight), 降妖 (extDevil)
     */
    private String name;
    private int age;
    private String weapon;
    private String formula;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void doMaigre() {
        System.out.println(name + "吃斋");
    }

    public void buddha() {
        System.out.println(name + "念佛");
    }

    public void doPilgrimage() {
        System.out.println(name + "取经");
    }

    public void fight() {
        System.out.println(name + "战斗");
    }

    public void extDevil() {
        System.out.println(name + "降妖");
    }

}
