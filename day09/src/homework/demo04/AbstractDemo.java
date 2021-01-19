package homework.demo04;

/**
 * Date:2021/1/19 19:03
 * Author:lyf
 */
public class AbstractDemo {
    public static void main(String[] args) {
        //没有继承抽象类
        Circle c1 = new Circle();
        c1.setR(2);
        System.out.println(c1.area()); //12.56

        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        r1.setHeight(3);
        System.out.println(r1.area()); //6.0

        //继承抽象类
        Circle c2 = new Circle();
        c2.setR(2);
        System.out.println(c2.area());  //12.56

        Rectangle r2 = new Rectangle();
        r2.setHeight(3);
        r2.setWidth(2);
        System.out.println(r2.area());  //6.0
    }
}
