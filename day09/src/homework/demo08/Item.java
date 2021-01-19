package homework.demo08;

/**
 * Date:2021/1/19 19:45
 * Author:lyf
 */
public class Item {
    private String code;
    private String name;
    private String type;
    private double price;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public Item(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
