package demo03.static1;

/**
 * Date:2021/1/22 15:29
 * Author:lyf
 */
public class Car {
    private String brand;
    private String type;

    private static int count = 0;

    public static int getCount(){
        Car.test();
        return Car.count;
    }
    public static void test(){
        System.out.println("test");
    }

    public Car() {
    }

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
        Car.count++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
