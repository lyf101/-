/**
 * Date:2021/1/16 11:34
 * Author:lyf
 */
public class Demo01Var {

    //int count = 10;
    public static void add(int a,int b){
        int r = a+b;

        {
            int count = 20;
            System.out.println("count = "+count);
        }

        //System.out.println("count = "+count);
    }

    /**
     * 总结：
     * {}称为代码块，可以形成作用域
     * 作用域可以嵌套，内层作用域可以访问外层作用域的变量，外层作用域不能访问内层作用域的变量
     *
     * */

    public static void main(String[] args) {

        add(10,20);
    }
}
