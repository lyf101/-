package homework.demo05;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Date:2021/1/30 18:55
 * Author:lyf
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("d");
        set.add("a");
        set.add("c");
        set.add("b");
        System.out.println(set);

        set.remove("b");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
