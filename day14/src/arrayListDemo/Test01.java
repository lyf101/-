package arrayListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/1/28 14:56
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("apple");
        list.add("banana");
        System.out.println(list);

        list.add(0,"coco");
        System.out.println(list);
        System.out.println(list.size());

        list.add("coco");
        System.out.println(list);

        System.out.println(list.get(2));


        list.remove(2);
        System.out.println(list);

        list.set(2,"new");
        System.out.println(list);
    }
}
