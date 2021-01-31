package homework.demo07;


import java.util.Collections;
import java.util.Comparator;
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
        User user4 = new User("王五呆",142);

        TreeSet<User> set = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.getName().length()>o2.getName().length()){
                    return 1;
                }else if(o1.getName().length()<o2.getName().length()){
                    return -1;
                }else return o1.getAge()-o2.getAge();
            }
        });
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        System.out.println(set);

    }
}
