package homework.demo002;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Date:2021/1/30 19:50
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("Tom",18,100,"class05");
        Student s2 = new Student("Jerry",22,70,"class04");
        Student s3 = new Student("Owen",25,90,"class05");
        Student s4 = new Student("Jim",30,80,"class05");
        Student s5 = new Student("Steve",28,66,"class06");
        Student s6 = new Student("Kevin",24,100,"class04");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        for (Student s:set){
            System.out.println(s);
        }
        System.out.println();
        for (Student s:set){
            if (s.getName().equals("Jerry")){
                s.setScore(90);
            }
        }
        for (Student s:set){
            System.out.println(s);
        }

        System.out.println();
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName().equals("Kevin")){
                iterator.remove();
            }
        }
        for (Student s:set){
            System.out.println(s);
        }
        System.out.println();

        int sum = 0;
        int num = 0;
        for (Student s:set){
            if(s.getClassNum().equals("class05")){
                sum+=s.getScore();
                num++;
            }
        }
        System.out.println(sum*1.0/num);


    }

}
