package demo01.this1;

/**
 * Date:2021/1/22 11:09
 * Author:lyf
 */
public class Dog {
    private String sn;
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String sn, String name) {
        this.sn = sn;
        this.name = name;
        this.age = 18;
    }

    public Dog(String sn, String name, int age) {
        this(sn, name);
        this.age = age;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
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

    @Override
    public String toString() {
        return "Dog{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
