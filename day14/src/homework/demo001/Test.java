package homework.demo001;

import java.util.ArrayList;

/**
 * Date:2021/1/28 20:44
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Point<Integer> point1 = new Point<>(1,2);
        Point<Integer> point2 = new Point<>(2,3);
        Point<Integer> point3 = new Point<>(3,4);
        Point<Integer> point4 = new Point<>(4,5);
        Point<Integer> point5 = new Point<>(5,6);

        ArrayList<Point<Integer>> list = new ArrayList<>();
        list.add(point1);
        list.add(point2);
        list.add(point3);
        list.add(point4);
        list.add(point5);
        System.out.println(list);

        Point<Integer> remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        list.set(3,new Point<>(3,3));
        System.out.println(list);




    }
}
