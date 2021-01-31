package homework.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Date:2021/1/30 18:32
 * Author:lyf
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(String str : list){
            System.out.println(str);
        }

        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o2)-Integer.valueOf(o1);
            }
        });
        System.out.println(list);
    }
}
