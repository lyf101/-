package demo03;

/**
 * Date:2021/1/19 14:56
 * Author:lyf
 */
public class Person {
    private String name;
    private int age;

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
        if(age < 0 || age > 150){
            System.out.println("年龄值不合法");
        }else this.age = age;
    }

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        setAge(age);
    }

    public void rest(){
        System.out.println(name+"正在休息");
    }

}
