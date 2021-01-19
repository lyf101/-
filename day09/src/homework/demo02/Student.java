package homework.demo02;

/**
 * Date:2021/1/19 18:48
 * Author:lyf
 */
public class Student extends Person {
    private String sn;
    public void study(){
        System.out.println(getName()+"学习");
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
