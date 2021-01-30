package homework.demo09;

import java.util.*;

/**
 * Date:2021/1/30 19:18
 * Author:lyf
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("one",6);
        map.put("two",3);
        map.put("ers",8);
        map.put("oinaas",2);
        map.put("aaa",1);

        Set<String> strings = map.keySet();
        for (String key:strings){
            System.out.println(key+"=>"+map.get(key));
        }

        Collection<Integer> values = map.values();
        for (int value : values){
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
