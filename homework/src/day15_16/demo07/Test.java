package day15_16.demo07;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Date:2021/2/16 12:06
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        String str = "abbbcdcddd";
        char[] chars = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        for(char c : chars){
            set.add(c);
        }

        String newStr = "";
        Object[] objects = set.toArray();
        for (Object c :objects){
            newStr+=c;
        }
        System.out.println(newStr);
    }
}
