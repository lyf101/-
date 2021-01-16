package demo;

/**
 * Date:2021/1/16 16:17
 * Author:lyf
 */
public class Test01Teacher {
    public static void main(String[] args) {
        Teacher t1= new Teacher();
        t1.name="kallen";
        t1.age=20;
        t1.tid="001";
        t1.sayHi();
        t1.teach("Java");

        Teacher t2 = new Teacher();
        t2.name="alex";
        t2.tid="002";
        t2.age=22;
        t2.sayHi();
        t2.teach("PHP");


        /**
         * 为什么存在面向对象？
         * 对象是数组的载体，开发本质上就是把数据存入计算机中，需要一种更复杂的数据类型，而且这个复杂的数据类型一定要是自定义的
         * 进而，软件开发就是把现实中数据存到计算机中，必须把有共同的特性和行为抽象到计算机中作为类存在，类又可以创建对象
         * 软件开发数据的展示时，一定要找对象=>无论你做什么都需要找对象=>在你眼里一切皆需要对象=>
         * 你眼里只有对象=>面向对象=>面向什么就可以看到什么
         */
    }
}
