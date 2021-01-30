package demo01Iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Date:2021/1/30 10:44
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next+" ");
        }

        System.out.println();

        for (Iterator<String> iterator1 = list.iterator();iterator1.hasNext();){
            String next = iterator1.next();
            System.out.print(next+" ");
        }
    }
}
