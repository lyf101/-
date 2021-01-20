package homeword.demo07;

/**
 * Date:2021/1/20 20:01
 * Author:lyf
 */
public class TestDemo {
    public static void main(String[] args) {
        Roboot roboot = null;

        roboot = new RobootA();
        roboot.setName("张三");
        ((RobootA) roboot).speak();


    }
}
