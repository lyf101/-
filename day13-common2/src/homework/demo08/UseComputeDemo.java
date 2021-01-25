package homework.demo08;

/**
 * Date:2021/1/25 19:40
 * Author:lyf
 */
public class UseComputeDemo {
    public static void main(String[] args) {
        Compute compute = new Add();
        int num1 = 14;
        int num2 = 2;
        int i = UseCompute.useCom(compute, num1, num2);
        System.out.println(i);

    }
}
