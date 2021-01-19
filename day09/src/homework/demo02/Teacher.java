package homework.demo02;

/**
 * Date:2021/1/19 18:47
 * Author:lyf
 */
public class Teacher extends Person{
    private int level;
    public void teach(){
        System.out.println(getName()+"授课");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
