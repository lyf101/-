package day7_9.demo05;

/**
 * Date:2021/2/8 10:24
 * Author:lyf
 */
public class Coffee extends Cup {
    public void print(){
        System.out.println("装咖啡");
    }

    public Coffee(String color, int vol) {
        super(color, vol);
    }

    public Coffee() {
    }
}
