package homeWork;

public class VarArgsDemo {

    /*需求；定义一个方法，传入两个参数，一个double数组表示多个货品的价格，一个double类型的折扣，返回货品总价格

    步骤：



            （1）方式一：定义方法，使用数组作为参数

            （2）方式二：定义方法，使用可变参数作为参数

            （3）调用两个方法*/

    public static double sumPrice(double[] prices, double discount) {
        double sumPrice = 0.0;
        for (double price : prices) {
            sumPrice += price;
        }
        return sumPrice * discount;
    }

    public static void main(String[] args) {
        double[] prices = {1.0, 2.0, 3.0, 4.0};
        double discount = 0.8;
        System.out.println("打完折后总价格为：" + sumPrice(prices, discount));
    }

}
