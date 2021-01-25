package cn.lyf.demo1.integer1;

/**
 * Date:2021/1/23 16:21
 * Author:lyf
 */
public class Test02 {
    public static void main(String[] args) {

        //装箱,把基本数类型->对应的包装类的过程
        Integer i1 = Integer.valueOf("10");
        Integer i2 = new Integer(10);
        System.out.println(i1);

        //自动装箱
        Integer i3 = 10;//jvm实际调用Integer i3 = Integer.valueOf(10);

        //拆箱，把包装类对象->对应的基本数类型
        int t1 = i1.intValue();
        int t2 = i2.intValue();

        //自动拆箱
        int t3 = i3;


        Object object = 10;
        /**
         * Integer i4 = 10;
         * Object object = i4;
         */
    }
}
