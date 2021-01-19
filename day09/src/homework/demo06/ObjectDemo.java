package homework.demo06;

/**
 * Date:2021/1/19 19:17
 * Author:lyf
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());

        /*Person p2 = new Person();
        System.out.println(p1.equals(p2));  //没重写equals返回false*/

        Person p2 = new Person();
        System.out.println(p1.equals(p2));  //true
    }
}
