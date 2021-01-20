package demo03;

/**
 * Date:2021/1/20 14:54
 * Author:lyf
 */
public class Test01 {
    public static void main(String[] args) {

        //声明时的类型称为编译时类型
        Animal animal = null;

        //运行时类型
        animal = new Dog();

        //可以使用父类引用子类实例
        Animal animal1 = new Dog();
        animal1.shout();
        animal1.showInfo();

        //父类表示更大的群体
        Animal animal2 = new Cat();
        animal2.shout();
        animal2.showInfo();

        /**
         * 总结：
         * 1.一句话：父类对象可以引用子类实例
         * 2.当编译时类型和运行时类型不一致时，就会出现多态
         * 3.编译时类型只能看到自己定义的方法，看不到子类特有的方法（不可见）
         *  多态建立在重写/实现的基础上
         */

    }
}
