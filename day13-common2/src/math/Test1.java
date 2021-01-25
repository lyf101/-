package math;

/**
 * Date:2021/1/25 15:05
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        double t = 9.1;
        //向上取整
        double ceil = Math.ceil(t);
        System.out.println(ceil);

        //向下取整
        double floor = Math.floor(t);
        System.out.println(floor);

        //需求：105条数据，
        double total = 105;
        int size = 10;
        int page = 0;
        page = (int) Math.ceil(total*1.0/size);
        System.out.println(page);


        System.out.println((int)Math.floor(Math.random()*11)+10);
    }
}
