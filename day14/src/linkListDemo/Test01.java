package linkListDemo;

import java.util.LinkedList;

/**
 * Date:2021/1/28 15:59
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add(0,"coco");
        System.out.println(linkedList);

        linkedList.set(0,"coco");
        System.out.println(linkedList);

        linkedList.remove(0);
        System.out.println(linkedList);

        System.out.println(linkedList.get(0));
    }

}
