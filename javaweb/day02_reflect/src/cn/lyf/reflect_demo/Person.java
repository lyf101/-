package cn.lyf.reflect_demo;


/**
 * Date:2021/3/3 15:09
 * Author:lyf
 */

public class Person {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void staticTest(String str){
        System.out.println("staticTest"+str);
    }

    public void test(){
        System.out.println("test");
    }
    public Person(){
        System.out.println("无参构造");
    }

    public Person(String name, Integer age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
