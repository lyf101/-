package cn.lyf;

/**
 * Date:2021/3/5 18:41
 * Author:lyf
 */

public class AnnocationDemo {

    @VIP
    public void test(){
        System.out.println("普通会员");
    }

    @VIP("VIP")
    public void vipTest(){
        System.out.println("VIP");
    }
}
