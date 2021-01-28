package homework.demo01;


import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/1/28 18:48
 * Author:lyf
 */
public class PlayerList {
    public static void main(String[] args) {

        /*int[] arr = {11,22,33,44,55};

        System.out.println(arr[2]);

        arr[2] = 333;
        System.out.println(Arrays.toString(arr));*/
        List<Integer> list = new ArrayList<>(5);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list.get(2));

        list.set(2,333);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
