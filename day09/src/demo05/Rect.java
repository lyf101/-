package demo05;

/**
 * Date:2021/1/19 16:46
 * Author:lyf
 */
public class Rect extends Graph {
    private int width;
    private int heigth;

    public double getArea(){
        return width*heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
