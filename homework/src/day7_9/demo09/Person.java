package day7_9.demo09;

import java.util.Arrays;

/**
 * Date:2021/2/8 10:51
 * Author:lyf
 */
public class Person {

    public static void shoot(){
        System.out.println("装子弹");
        //装满子弹
        while (Gun.getNum()<30){
            Gun.push();
            System.out.println(Arrays.toString(Gun.getClip()));
        }

        System.out.println("开枪");
        //射完子弹
        while (Gun.getNum()>0){
            Gun.pop();
            System.out.println(Arrays.toString(Gun.getClip()));
        }
        System.out.println("子弹打完");
    }

    public static void main(String[] args) {
        shoot();
    }
}
