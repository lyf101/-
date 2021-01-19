package homework.demo04;

/**
 * Date:2021/1/19 18:59
 * Author:lyf
 */
public class Circle extends AbstractGraph {
    private int r;

    public double area() {
        return r * r * 3.14;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
