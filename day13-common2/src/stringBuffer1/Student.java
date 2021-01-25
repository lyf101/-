package stringBuffer1;

/**
 * Date:2021/1/25 14:35
 * Author:lyf
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student sayHi(){
        System.out.println(name+"说hi");
        return this;
    }

    public Student learn(){
        System.out.println(name+"学java");
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
