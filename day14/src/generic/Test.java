package generic;

/**
 * Date:2021/1/28 17:17
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Point<Integer> point = new Point<Integer>();
        point.setX(1);
        point.setY(2);
        System.out.println(point);

        Point<Double> point1 = new Point<Double>();
        point1.setX(10.1);
        point1.setY(10.2);
        System.out.println(point1);
    }
}
