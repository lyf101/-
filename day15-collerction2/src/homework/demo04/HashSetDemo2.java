package homework.demo04;

import java.util.HashSet;

/**
 * Date:2021/1/30 18:51
 * Author:lyf
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        User user1 = new User("张三",12);
        User user2 = new User("李四",13);
        User user3 = new User("王五",14);

        HashSet<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }

}
