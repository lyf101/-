package homework.demo04;

/**
 * Date:2021/2/1 19:56
 * Author:lyf
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        sort(2,1);
    }

    public static void sort(int a,int b){
        if(a>b) {
            System.out.println("排序成功");
        }else {
            throw new RuntimeException("排序失败，a<b");
        }
    }
}
