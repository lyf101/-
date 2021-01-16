package homeWork;

public class Demo07 {

    /*求出1 + 2！+ 3！+ 4！+...+20！的结果，解释：2！为1*2，3！为1*2*3，4！为1*2*3*4，以此类推。*/
    public static int jie(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jie(n - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += jie(i);
        }
        System.out.println("结果为：" + sum);
    }
}
