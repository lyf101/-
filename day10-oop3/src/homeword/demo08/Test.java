package homeword.demo08;

/**
 * Date:2021/1/20 20:14
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Seater seater = null;

        seater = new Taxi();
        ((Taxi) seater).run();
        seater.setBrand("捷达");
        seater.maned();

        seater = new Airliner();
        ((Airliner) seater).fly();
        seater.setBrand("波音");
        seater.maned();

        seater = new Ship();
        ((Ship) seater).swim();
        seater.setBrand("泰坦尼克号");
        seater.maned();
    }
}
