package homework.demo08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Date:2021/1/30 19:06
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
        System.out.println(map);

        HashMap<String,Integer> map1 = new HashMap<>();
        map.put("new",1111);
        map.putAll(map1);
        System.out.println(map);


        Integer two = map.remove("two");
        System.out.println(two);
        System.out.println(map);

        map.put("one",1);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("aaa"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(2324));

        Set<String> strings = map.keySet();
        for (String str:strings){
            System.out.println(str);
        }

        Collection<Integer> values = map.values();
        for (Integer i:values){
            System.out.println(i);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer> en : entries){
            System.out.println(en);
        }

    }
}
