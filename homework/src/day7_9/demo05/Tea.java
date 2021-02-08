package day7_9.demo05;

/**
 * Date:2021/2/8 10:21
 * Author:lyf
 */
public class Tea extends Cup {
    public void print(){
        System.out.println("装茶");
    }

    public Tea(String color, int vol) {
        super(color, vol);
    }

    public Tea() {
    }
}
