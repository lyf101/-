package homework.demo05;

/**
 * Date:2021/2/1 19:59
 * Author:lyf
 */
public class ThrowsDemo {
    public static void main(String[] args) throws Exception {
        test(2,1);
    }
    
    public static void test(int a,int b) throws Exception {
        if(a>b){
            System.out.println("排序成功");
        }else {
            throw new Exception("排序失败，a<b");
        }

    }
}
