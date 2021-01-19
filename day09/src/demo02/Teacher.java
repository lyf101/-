package demo02;

/**
 * Date:2021/1/19 11:28
 * Author:lyf
 */
public class Teacher extends Person {
    int level;  //级别
    public void teach(String aClass){
        System.out.println(name + "正在授课："+aClass);
    }
}
