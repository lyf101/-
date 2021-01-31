package demo03;

/**
 * Date:2021/1/31 16:49
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        try {
            s.setGender("人妖");
        } catch (GenderException e) {
            e.log();
        }
    }
}
