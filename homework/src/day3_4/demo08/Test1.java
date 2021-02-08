package day3_4.demo08;

/**
 * Date:2021/2/2 23:27
 * Author:lyf
 */
public class Test1 {
    public static void main(String[] args) {
        double land = 0.08;
        double zolmo = 8848130;
        int num = 0;
        while (land < zolmo) {
            land *= 2;
            num++;
        }
        System.out.println(num);
    }
}
