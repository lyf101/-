package homework.demo001;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Date:2021/1/30 19:36
 * Author:lyf
 */
public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(10,20);
        Point p3 = new Point(11,12);
        Point p4 = new Point(13,23);
        Point p5 = new Point(14,24);

        HashSet<Point> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        System.out.println(set);

        set.remove(p2);
        System.out.println(set);

        for (Point p : set){
            System.out.println(p);
        }

    }
}
