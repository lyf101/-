package homeword.demo04;

import homeword.demo01.Animal;
import homeword.demo01.Frog;

/**
 * Date:2021/1/20 18:48
 * Author:lyf
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        Animal animal = new Frog();;
        Frog frog = (Frog) animal;

        if(frog instanceof Animal){
            System.out.println("青蛙对象可以强转动物类");
        }else System.out.println("青蛙对象不可以强转动物类");

    }
}
