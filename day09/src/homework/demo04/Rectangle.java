package homework.demo04;

/**
 * Date:2021/1/19 18:55
 * Author:lyf
 */
public class Rectangle extends AbstractGraph {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
