package homework.demo10;

/**
 * Date:2021/1/19 20:01
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {

        Course c1 = new Course();
        c1.setCourseName("语文");
        c1.setGrade(88);
        Course c2 = new Course();
        c2.setCourseName("数学");
        c2.setGrade(98);

        Student s1 = new Student("黄小铭",14);
        s1.setCourse(c1);
        Student s2 = new Student("王飞",15);
        s2.setCourse(c2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
