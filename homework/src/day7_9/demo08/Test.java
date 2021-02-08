package day7_9.demo08;

/**
 * Date:2021/2/8 10:49
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.setNetInCome(13000);
        p1.eat(1000);
        p1.payRent(1000);
        p1.seeMovie(400);

        System.out.println(p1.getNetInCome());
    }
}
