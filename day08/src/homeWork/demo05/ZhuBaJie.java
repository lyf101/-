package homeWork.demo05;

/**
 * Date:2021/1/16 19:03
 * Author:lyf
 */
public class ZhuBaJie {

    /**
     * **猪八戒类**
     *
     * **字段：**name，age，武器(weapon),媳妇(wife)，
     *
     * **方法：**念佛(buddha)，取经(doPilgrimage)，战斗(fight), 牵马 (holdHorse)
     */
    private String name;
    private int age;
    private String weapon;
    private String wife;

    public void buddha(){
        System.out.println(name+"念佛");
    }

    public void doPilgrimage(){
        System.out.println(name+"取经");
    }

    public void fight(){
        System.out.println(name+"战斗");
    }

    public void holdHorse(){
        System.out.println(name+"牵马");
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

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
