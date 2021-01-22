package homeword.demo06;

/**
 * Date:2021/1/22 19:16
 * Author:lyf
 */
public class Item {
    private String code;
    private String name;
    private String type;
    private double price;
    private static int totalNum = 0;

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

    public static int getTotalNum() {
        return totalNum;
    }

    public Item() {
        Item.totalNum++;
    }

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
        Item.totalNum++;
    }
}
