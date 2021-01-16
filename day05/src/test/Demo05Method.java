package test;

public class Demo05Method {


    /*构成重载
        1.同一类
        2.相同方法名
        3.参数不同（顺序，类型，数量）
     */
    public static void main(String[] args) {



    }

    public static double add(double a,int b){
        return a+b;
    }

    //参数类型不同
    public static float add(int a,float b){
        return a+b;
    }

    //参数数量不同
    public static double add(double a,int b,int c){
        return a+b+c;
    }

    //参数顺序不同
    public static double add(int a,double b){
        return a+b;
    }
}
