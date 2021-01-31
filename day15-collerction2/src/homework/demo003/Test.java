package homework.demo003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Date:2021/1/30 20:02
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("小斌",22);
        Employee e2 = new Employee("地雷",23);
        Employee e3 = new Employee("吉吉",21);
        Employee e4 = new Employee("东方菇凉",18);
        Employee e5 = new Employee("独孤求败",28);
        Employee e6 = new Employee("糖糖",25);

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(e4);
        list2.add(e5);
        list2.add(e6);

        Department d1 = new Department("部门1",list1);
        Department d2 = new Department("部门2",list2);

        System.out.println(d1);
        System.out.println(d2);
    }
}
