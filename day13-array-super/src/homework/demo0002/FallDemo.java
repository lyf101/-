package homework.demo0002;

/**
 * Date:2021/1/27 20:02
 * Author:lyf
 */
public class FallDemo {
    
    public static void main(String[] args) {
        double h = 100;
        int i = 0;
        int n = 2;
        double ret = h;
        double sum = 0;

        for (i = 1;i<=n;i++){

            ret = ret/2;
            sum += ret*3;
            if (i == n){
                sum = sum - ret;
            }
        }
        System.out.println(sum);
        System.out.println(ret);


    }
}
