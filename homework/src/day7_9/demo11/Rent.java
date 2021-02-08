package day7_9.demo11;

/**
 * Date:2021/2/8 12:58
 * Author:lyf
 */
public class Rent {
    private String type;
    private double money;
    private int day;

    public double sumMoney() {
        return money * day;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "type='" + type + '\'' +
                ", money='" + money + '\'' +
                ", day=" + day +
                '}';
    }

    public Rent() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Rent(String type, double money, int day) {
        this.type = type;
        this.money = money;
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
