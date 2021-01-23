package cn.lyf;


/**
 * Date:2021/1/23 19:50
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        int day = 4;
        double rent = bmw.rent(day);
        System.out.println("租聘" + bmw.getType() + " " + day + "天,共花费：" + rent + "元");
    }
}
