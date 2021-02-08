package day7_9.demo11;

/**
 * Date:2021/2/8 12:37
 * Author:lyf
 */
public class Car {
    private String type;
    private double money;

    public Car() {
    }

    public Car(String type, double money) {
        this.type = type;
        this.money = money;
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

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", money=" + money +
                '}';
    }
}
