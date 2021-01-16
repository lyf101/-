package homeWork.demo03;

/**
 * Date:2021/1/16 18:46
 * Author:lyf
 */
public class Student {

    /**
     * 需求：定义一个符合JavaBean规范的学生类
     *
     * 作业要求：
     *
     * （1）学生有姓名、年龄两个字段
     *
     * （2）符合JavaBean规范
     */
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
