package uuid;

import java.util.UUID;

/**
 * Date:2021/1/25 16:14
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
