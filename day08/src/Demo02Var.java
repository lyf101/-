/**
 * Date:2021/1/16 11:34
 * Author:lyf
 */
public class Demo02Var {


    String name;
    int age = 100;
    char gender;

    public void test(){
        int count = 10;
        System.out.println(name);
        System.out.println(age);
        System.out.println("|"+gender+"|");
    }
    public void test2(){
        System.out.println(name);

        int i = 0;
        for(;i<3;i++){

        }
        System.out.println(i);
    }

    public static void main(String[] args) {

        //静态方法调用非静态要先创建对象
        Demo02Var demo02Var = new Demo02Var();
        demo02Var.test();
    }
}
