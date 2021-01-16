/**
 * Date:2021/1/16 15:18
 * Author:lyf
 */
public class Demo03Test {


    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);
        student1.learn("JAVA");
        student1.sayHi();

        Student student2 = new Student();
        System.out.println(student2);
        student2.learn("PHP");
        student2.sayHi();
    }
}
