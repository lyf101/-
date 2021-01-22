package homeword.demo02;

import homeword.demo01.Dog;

/**
 * Date:2021/1/22 18:47
 * Author:lyf
 */
public class SunFinalClass extends FinalClass {
    //- final修饰的方法：最终的方法, 该方法不能被子类覆盖
    /*public void showInfo(){

    }*/

    //- final修饰的变量：表示常量，该变量只能赋值一次，不能再重新赋值。
    /*final int id = 0;

    public void serId(){
        id = 1;
    }*/

    public static void main(String[] args) {
        //- 基本数据类型：表示的值不能改变
        /*final int i = 0;
        i = 1;*/

        //- 引用数据类型：所引用的地址值不能改变
       /* final Dog dog = new Dog();
        dog = new Dog();*/
    }
}
