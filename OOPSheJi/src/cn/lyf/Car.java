package cn.lyf;

/**
 * Date:2021/1/23 19:28
 * Author:lyf
 */
public abstract class Car {
    private String type;
    private double dayRent;


    public double rent(int day){
        return day*this.dayRent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDayRent() {
        return dayRent;
    }

    public void setDayRent(double dayRent) {
        this.dayRent = dayRent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", dayRent=" + dayRent +
                '}';
    }
}
