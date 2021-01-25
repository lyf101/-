package homework.demo02;

import java.util.Random;

/**
 * Date:2021/1/25 18:53
 * Author:lyf
 */
public class RandomDemo {
    public static void main(String[] args) {
        //使用随机数random类，获取随机数
        Random random = new Random();
        //获取[0,5)随机数
        int i = random.nextInt(5);
        System.out.println(i);
    }
}
