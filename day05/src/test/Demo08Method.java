package test;

public class Demo08Method {
    public static void main(String[] args) {
        int n = 120;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+"==>"+fblq(i));
        }
    }

    public static int fblq(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fblq(i - 1) + fblq(i - 2);
        }

    }
}
