package homework.demo07;


import java.util.TreeSet;

/**
 * Date:2021/1/30 19:02
 * Author:lyf
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        User user1 = new User("张三疯",16);
        User user2 = new User("李四",12);
        User user3 = new User("王五呆",14);

        TreeSet<User> set = new TreeSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }
}
