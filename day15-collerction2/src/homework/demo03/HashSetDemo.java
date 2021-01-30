package homework.demo03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Date:2021/1/30 18:46
 * Author:lyf
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("b");
        set.add("d");
        set.add("a");
        set.add("c");
        System.out.println(set);

        set.remove("b");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
