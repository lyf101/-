package demo;

/**
 * Date:2021/1/16 15:14
 * Author:lyf
 */
public class Student {

    //成员变量=>类的特征
    String sid;
    String name;
    int age;

    //成员方法=>类的行为
    public void learn(String aClass){
        System.out.println(name+"正在学习"+aClass);
    }

    public void sayHi(){
        System.out.println(name+"say hello");
    }
}
