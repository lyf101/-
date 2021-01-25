package homework.demo03;

import java.util.UUID;

/**
 * Date:2021/1/25 18:55
 * Author:lyf
 */
public class UUIDDemo {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        String index = str.substring(0,4);
        System.out.println(index);

    }
}
