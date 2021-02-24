package cn.homework.demo02;

/**
 * Date:2021/2/24 18:33
 * Author:lyf
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
