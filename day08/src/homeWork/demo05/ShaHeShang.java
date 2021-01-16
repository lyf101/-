package homeWork.demo05;

/**
 * Date:2021/1/16 19:08
 * Author:lyf
 */
public class ShaHeShang {

    /**
     * **沙和尚类**
     *
     * **字段：**name，age，武器(weapon), 流沙河(sandRiver)，
     *
     * **方法:**念佛(buddha)，取经(doPilgrimage)，战斗(fight), 挑行李 pickUpLuge
     *
     */
    private String name;
    private int age;
    private String weapon;
    private String sandRiver;

    public void buddha(){
        System.out.println(name+"念佛");
    }

    public void doPilgrimage(){
        System.out.println(name+"取经");
    }

    public void fight(){
        System.out.println(name+"战斗");
    }

    public void pickUpLuge(){
        System.out.println(name+"挑行李");
    }

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

    public String getSandRiver() {
        return sandRiver;
    }

    public void setSandRiver(String sandRiver) {
        this.sandRiver = sandRiver;
    }
}
