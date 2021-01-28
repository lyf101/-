package homework.demo06;

import generic.Point;

/**
 * Date:2021/1/28 19:41
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Point<Integer> point = new Point<>();
        point.setX(19);
        point.setY(20);

        System.out.println(point);

        Point<Double> point1 = new Point<>();
        point1.setX(10.0);
        point1.setY(20.0);
        System.out.println(point1);
    }
}
