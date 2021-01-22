package homeword.demo01;

/**
 * Date:2021/1/22 18:42
 * Author:lyf
 */
public class StaticDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("二狗");
        dog.showInfo();

        Dog.run();
        Dog.getAge();

    }
}
