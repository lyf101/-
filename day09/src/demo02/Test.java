package demo02;

/**
 * Date:2021/1/19 11:29
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "二狗";
        teacher.age = 20;
        teacher.level = 10;
        teacher.rest();
        teacher.teach("Java");
    }
}
