package day7_9.demo05;


/**
 * Date:2021/2/8 10:26
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        Cup cup = new Cup("red",1);
        cup.print();

        Cup tea = new Tea("green",2);
        tea.print();

        Cup coffee = new Coffee("break",3);
        coffee.print();
    }
}
