package day7_9.demo03;

/**
 * Date:2021/2/8 10:13
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.init("张三","男");
        student.modify("李四");
        student.diplay();
    }
}
