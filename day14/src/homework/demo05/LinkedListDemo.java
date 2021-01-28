package homework.demo05;

import java.util.LinkedList;
import java.util.List;

/**
 * Date:2021/1/28 19:36
 * Author:lyf
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst("first");

        list.addLast("last");

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);


    }
}
