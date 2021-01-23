package cn.lyf.demo1.singlenton;

/**
 * Date:2021/1/23 15:00
 * Author:lyf
 */
//饿汉式
public class AppSinglenton {
    private static AppSinglenton appSingleton = new AppSinglenton();

    //1>私有构造方法
    private AppSinglenton(){

    }

    //2>向外界提供单例统一的访问方式
    public static AppSinglenton getInstance(){
        return appSingleton;
    }

    //3>把工具方法附加到该单例上
    public void printArray(){
        System.out.println("打印数组");
    }
}
