package day15_16.demo11;


/**
 * Date:2021/2/16 12:59
 * Author:lyf
 */
public class PointUtils {
    private static PointUtils pointUtils = new PointUtils();

    private PointUtils(){

    }

    public static PointUtils getInstance(){
        return pointUtils;
    }

    public float z(Point point1,Point point2){

        float x1 = point1.getX();
        float y1 = point1.getY();
        float x2 = point2.getX();
        float y2 = point2.getY();
        float x = Math.abs(x1-x2);
        float y = Math.abs(y1-y2);
        return (float) Math.sqrt(x*x+y*y);
    }
}
