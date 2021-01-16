package homeWork.demo01;

/**
 * Date:2021/1/16 18:34
 * Author:lyf
 */
public class CatDemo {
    /*需求：作为Cat类和对象的测试类

    步骤：

            （1）创建Cat对象c

            （2）使用c对象调用说话方法

            （3）给对象成员变量设置值

            （4）再使用c对象调用说话方法，观察成员变量的值的改变

            （5）获取c对象的成员变量
*/
    public static void main(String[] args) {
        //（1）创建Cat对象c
        Cat c = new Cat();
        //（2）使用c对象调用说话方法
        c.say();
        //（3）给对象成员变量设置值
        c.name = "tom";
        c.age = 1;
        //（4）再使用c对象调用说话方法，观察成员变量的值的改变
        c.say();
        //（5）获取c对象的成员变量
        System.out.println(c.name + "猫" + c.age + "岁");
    }

}
