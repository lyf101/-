package homeword.demo08;

/**
 * Date:2021/1/22 19:38
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("001","123");
        User user2 = new User("002","456");
        User user3 = new User("003","789");

        user1.setUsername("111");

        System.out.println(user1);
        System.out.println("用户总数："+User.getTotalUser());
    }
}
