package test;

public class Demo04Method {
    public static void main(String[] args) {

        double[] arr = {1.0,5.0,3.0,2.0,4.0};
        double discount = 0.8;
        System.out.println("商品总价格为:"+getTotalPrice(discount,arr));

    }

    //传入两个参数，一个表示多个商品价格，一个表示折扣，返回总价格
    public static double getTotalPrice(double discount, double... prices) {
        double total = 0.0;
        for (Double price : prices) {
            total += price;
        }
        return total * discount;
    }
}
