package homework.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/1/28 20:38
 * Author:lyf
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(11);
        list.add(10);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(0,8);
        System.out.println(list);

        Integer integer = list.get(0);
        System.out.println(integer);

    }
}
