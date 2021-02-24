package cn.homework.demo02;

/**
 * Date:2021/2/24 18:34
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        MyRunnable myRun = new MyRunnable();
        Thread a = new Thread(myRun,"线程A");
        Thread b = new Thread(myRun,"线程B");
        Thread c = new Thread(myRun,"线程C");

        a.start();
        b.start();
        c.start();
    }
}
