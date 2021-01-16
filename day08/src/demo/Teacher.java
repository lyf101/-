package demo;

/**
 * Date:2021/1/16 16:15
 * Author:lyf
 */
public class Teacher {
    String tid;
    String name;
    int age;

    /**
     * 如果一个类没有显示的定义无参构造方法，jvm默认会为该类分配一个无参构造方法
     * 如果开发者显示定义了无参构造方法，jvm不再分配无参构造
     * 形式：
     * public Teacher(){
     *
     * }
     */

    //无参构造一定用于对实例进行赋初值/默认值
    //如果想在构建对象时就给对象赋值，此时我们可以考虑使用有参构造

    /**
     * 如果一个类，开发者没有显示的定义任何构造方法，jvm会默认分配无参构造；
     * 如果开发者定义了有参或者无参，jvm都不再分配无参构造；
     * 好的开发习惯：当定义了有参构造时，一定习惯性的把无参构造给加上，哪怕无参构造什么也不做。
     */


    public void teach(String aClass){
        System.out.println(name+"正在教:"+aClass);
    }

    public void sayHi(){
        System.out.println(name+" say hello");
    }
}
