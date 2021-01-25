package homework.demo10;

/**
 * Date:2021/1/25 20:28
 * Author:lyf
 */
public class CpCode {



    public void getCpCode(double orderFee,String province){
        if (orderFee>128||province.equals("广东省")){
            System.out.println("SF");
        }else if(orderFee>58||province.equals("北京市")){
            System.out.println("EMS");
        }else {
            System.out.println("ZTO");
        }
    }
}
