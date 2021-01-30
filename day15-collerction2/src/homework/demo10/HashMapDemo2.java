package homework.demo10;

import java.util.HashMap;

/**
 * Date:2021/1/30 19:23
 * Author:lyf
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        String str = "pa0sdj89h21nl;dca082[daougj2p[c091pn -=i1c-i1pdcmz02-=0jp";
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else map.put(c,map.get(c)+1);
        }
        System.out.println(map);
    }
}
