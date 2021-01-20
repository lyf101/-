package homeword.demo06;

/**
 * Date:2021/1/20 19:48
 * Author:lyf
 */
public class TestDemo {
    public static void main(String[] args) {
        Biology biology = null;

        //引用数据类型自动转换
        biology = new Student();

        //引用数据类型强制转换
        Student student = (Student)biology;

        student.think();
        student.study();
        student.sleep();
        student.eat();
        student.breathe();


    }
}
