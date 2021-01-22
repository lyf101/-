package demo03.static1;

import java.util.List;

/**
 * Date:2021/1/22 15:31
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        Car car1 = new Car("奔驰", "GLA200");
        System.out.println(car1);

        Car car2 = new Car("BMW", "5X");
        System.out.println(car2);

        System.out.println(Car.getCount());

        System.out.println(car1.getCount());
        System.out.println(car2.getCount());
    }
}
