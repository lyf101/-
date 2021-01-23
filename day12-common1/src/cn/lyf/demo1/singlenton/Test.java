package cn.lyf.demo1.singlenton;

/**
 * Date:2021/1/23 15:03
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        //jvm加载AppSinglenton时单例已经创建好了
        System.out.println(AppSinglenton.getInstance());
        System.out.println(AppSinglenton.getInstance());

        AppSinglenton.getInstance().printArray();

    }
}
