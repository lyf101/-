package cn.lyf.homework.demo09;

/**
 * Date:2021/1/23 19:20
 * Author:lyf
 */
public class ItemDemo {
    private String name;
    private double price;

    public ItemDemo() {
    }

    public ItemDemo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemDemo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
