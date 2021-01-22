package demo02.super1;

/**
 * Date:2021/1/22 11:58
 * Author:lyf
 */
public class Dog extends Pet {
    private String strain;

    public Dog() {
        super();
    }


    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("品种:" + this.strain);
    }
}
