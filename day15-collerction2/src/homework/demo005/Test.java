package homework.demo005;

import java.util.HashMap;
import java.util.Set;

/**
 * Date:2021/1/30 20:20
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("stef", "p2p");
        map.put("will", "javaWeb");
        map.put("neld", "springmvc");
        map.put("hesj", "wms");
        map.put("bunny", "javaWeb");
        map.put("hhaiy", "javaSe");

        Set<String> strings = map.keySet();
        for (String str : strings) {
            System.out.println(str + "教" + map.get(str));
        }
        System.out.println();

        map.put("dafei", "jdbc");
        map.put("hhaiy", "javaWeb");
        Set<String> strings2 = map.keySet();
        for (String str : strings2) {
            System.out.println(str + "教" + map.get(str));
        }
        System.out.println();

        Set<String> strings3 = map.keySet();
        for (String str : strings3) {
            if (map.get(str).equals("javaWeb")) {
                System.out.println(str);
            }
        }

    }
}
