package demo01;

/**
 * Date:2021/1/19 10:33
 * Author:lyf
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("this = "+this);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150){
            System.out.println("年龄值不合法");
            age = 0;
        }
        this.age = age;
    }
    public Student(){

    }
    public Student(String name,int age){
        setAge(age);
        setName(name);
    }
    public void showInfo(){
        System.out.println("名称："+ name);
        System.out.println("年龄："+ age);
    }
}
