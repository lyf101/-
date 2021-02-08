package day7_9.demo11;

/**
 * Date:2021/2/8 12:38
 * Author:lyf
 */
public class Bus {
    private String name;
    private String type;
    private double money;

    public Bus() {
    }

    public Bus(String name, String type, double money) {
        this.name = name;
        this.type = type;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
