package homework.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Date:2021/1/30 18:36
 * Author:lyf
 */
public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        /*for(String str:list){
            if (str.equals("2")){
                list.remove("2");
            }
        }
        System.out.println(list);*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("2")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
