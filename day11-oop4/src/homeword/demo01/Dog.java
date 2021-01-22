package homeword.demo01;

/**
 * Date:2021/1/22 18:41
 * Author:lyf
 */
public class Dog {
    private String name;
    private static int age;

    public static int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("狗");
    }
    public static void run(){
        System.out.println("跑步");
    }
}
