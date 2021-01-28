package homework.demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date:2021/1/28 19:26
 * Author:lyf
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("first");
        list.add("n");
        list.add("1");
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("a");
        System.out.println(list);

        list.add(2,"two");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("n");
        list1.add("1");
        list1.add("q");
        list1.add("w");

        list.addAll(list1);
        System.out.println(list);


        Object remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

        list.removeAll(list1);
        System.out.println(list);

        Object change = list.set(1, "change");
        System.out.println(change);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        System.out.println(list.isEmpty());

        System.out.println(list.get(0));

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println(list.contains("first"));
    }
}
