package homework.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2021/1/28 19:34
 * Author:lyf
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        System.out.println(list);
    }
}
