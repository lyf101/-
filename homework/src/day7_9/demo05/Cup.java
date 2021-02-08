package day7_9.demo05;

/**
 * Date:2021/2/8 10:19
 * Author:lyf
 */
public class Cup {
    private String color;
    private int vol;

    public void print(){
        System.out.println("装液体");
    }

    public Cup() {
    }

    public Cup(String color, int vol) {
        this.color = color;
        this.vol = vol;
    }
}
