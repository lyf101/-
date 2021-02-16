package day15_16.demo11;

/**
 * Date:2021/2/16 12:57
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3,4);
        Point point2 = new Point(4,2);
        float z = PointUtils.getInstance().z(point1,point2);
        System.out.println(z);
    }
}
