package day23_24.demo05;

/**
 * Date:2021/2/2 23:17
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int i = 100;
        while (i>0){
            if (i%2==1){
                odd++;
            }else {
                even++;
            }
            i--;
        }
        System.out.println("奇数总和："+odd+"  偶数总和："+even);
    }
}
