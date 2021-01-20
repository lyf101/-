package homeword.demo02;

/**
 * Date:2021/1/20 18:43
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = null;
        animal = new Dog();
        animal.shout();

        animal = new Cat();
        animal.shout();
    }
}
