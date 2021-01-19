package homework.demo07;

/**
 * Date:2021/1/19 19:22
 * Author:lyf
 */
public class Prentice {
    private String name;
    private int age;
    private String weapon;

    public void buddha(){
        System.out.println(name+"念佛");
    }
    public void doPilgrimage(){
        System.out.println(name+"取经");
    }
    public void fight(){
        System.out.println(name+"战斗");
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

    @Override
    public String toString() {
        return "Prentice{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
