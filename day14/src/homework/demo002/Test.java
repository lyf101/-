package homework.demo002;

import java.util.ArrayList;

/**
 * Date:2021/1/28 20:50
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studList = new ArrayList<>();

        studList.add(new Student("Tom", 18, 100, "class05"));
        studList.add(new Student("Jerry", 22, 70, "class04"));
        studList.add(new Student("Owen", 25, 90, "class05"));
        studList.add(new Student("Jim", 30, 80, "class05"));
        studList.add(new Student("Steve", 28, 66, "class06"));
        studList.add(new Student("Kevin", 24, 100, "class04"));

        System.out.println(studList);

        for (Student student : studList) {
            if (student.getName().equals("Jerry")) {
                student.setScore(90);
            }
        }
        System.out.println(studList);

        int index = 0;
        for (int i = 0; i < studList.size(); i++) {
            if (studList.get(i).getName().equals("Kevin")) {
                index = i;
            }
        }
        Student remove = studList.remove(index);
        System.out.println(remove);
        System.out.println(studList);


        int num = 0;
        int sum = 0;
        for (Student student : studList) {
            if (student.getClassNum().equals("class05")) {
                num++;
                sum = student.getScore() + sum;
            }
        }
        System.out.println(sum*1.0/num);

    }
}
