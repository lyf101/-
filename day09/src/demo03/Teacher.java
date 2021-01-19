package demo03;

/**
 * Date:2021/1/19 14:56
 * Author:lyf
 */
public class Teacher extends Person{
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Teacher(){}
    public Teacher(String name,int age,int level){
        setName(name);
        setAge(age);
        setLevel(level);
    }

    public void teach(String aClass){
        System.out.println(getName()+"正在授课");
    }
}
