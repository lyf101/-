package day7_9.demo02;

/**
 * Date:2021/2/8 10:07
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("张三","123");
        System.out.println(user);

        user.setUsername("李四");
        user.setPassword("123456");
        System.out.println(user);
    }
}
