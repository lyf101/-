package demo02.super1;

/**
 * Date:2021/1/22 11:56
 * Author:lyf
 */
public class Pet {
    private String name;
    private int health;
    private int love;

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void showInfo(){
        System.out.println("名称："+this.name);
        System.out.println("健康值："+this.health);
        System.out.println("亲密度："+this.love);

    }
}
