package homework.demo0002;

/**
 * Date:2021/1/27 20:02
 * Author:lyf
 */
public class FallDemo {
    public static void main(String[] args) {
        double h = 100;
        int i = 0;
        double ret = h;
        double sum = 0;

        for (i = 1;i<=10;i++){
            ret = ret/2;
            sum += ret*3;
        }
        System.out.println(sum);
        System.out.println(ret);


    }
}
