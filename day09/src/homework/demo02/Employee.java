package homework.demo02;

/**
 * Date:2021/1/19 18:51
 * Author:lyf
 */
public class Employee extends Person {
    private int entry;
    private void work(){
        System.out.println(getName()+"工作");
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }
}
