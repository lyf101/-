package homework.demo02;

/**
 * Date:2021/1/19 18:46
 * Author:lyf
 */
public class Person {
    private String name;
    private int age;

    public void sleep(){
        System.out.println(name+"休息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
