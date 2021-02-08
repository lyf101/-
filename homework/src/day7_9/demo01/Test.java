package day7_9.demo01;

/**
 * Date:2021/2/8 10:02
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.alterCarNum("辽A9752");
        car1.up();
        System.out.println(car1);

        Car car2 = new Car("辽B52086",150,200);
        car2.down();
        System.out.println(car2);
    }
}
