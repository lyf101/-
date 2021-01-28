package arrayListDemo;

import java.util.ArrayList;

/**
 * Date:2021/1/28 15:27
 * Author:lyf
 */
public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student("大狗",20);
        Student s2 = new Student("二狗",19);
        Student s3 = new Student("三狗",18);

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);


        System.out.println(list.size());
    }
}
