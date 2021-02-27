package cn.lyf01.homework.demo02.demo08;

import java.io.*;
import java.util.*;

/**
 * Date:2021/2/26 17:30
 * Author:lyf
 */
public class calcCharNumDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Idea\\workspacelang\\day18-io\\src\\cn\\lyf01\\homework\\demo02\\demo08\\calcCharNum.txt");
        InputStream is = new FileInputStream(file);
        String str = "";
        int len;
        byte[] b = new byte[100];
        while ((len = is.read(b)) != -1) {
            str += new String(b, 0, len);
        }
        System.out.println(str);
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> keySet = map.keySet();
        Object[] objects = keySet.toArray();
        Arrays.sort(objects);
        String lastStr = "";

        for (int i = 0; i < objects.length; i++) {
            if (i == objects.length - 1) {
                lastStr += objects[i] + "(" + map.get(objects[i]) + ")";
            } else {
                lastStr += objects[i] + "(" + map.get(objects[i]) + "),";
            }
        }

        System.out.println(lastStr);
    }
}
