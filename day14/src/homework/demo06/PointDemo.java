package homework.demo06;

/**
 * Date:2021/1/28 19:39
 * Author:lyf
 */
public class PointDemo<T> {
    private  T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PointDemo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
