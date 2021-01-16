package homeWork.demo02;


/**
 * Date:2021/1/16 18:34
 * Author:lyf
 */
public class CatDemo {
    /**
     * 需求：作为Cat类和对象的测试类
     *
     * 步骤：
     *
     * （1）使用无参数构造器创建对象c1并初始化c1的成员变量
     *
     * （2）使用带参构造器创建对象c2同时初始化成员变量，并调用说话方法
     */

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "jerry";
        c1.age = 2;

        Cat c2 = new Cat("tom", 1);
        c2.say();
    }

}
