package homework.demo07;

/**
 * Date:2021/1/19 19:31
 * Author:lyf
 */
public class ZBJ extends Prentice {
    private String wife;
    public void holdHorse(){
        System.out.println(super.getName()+"牵马");
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return super.toString()+"ZBJ{" +
                "wife='" + wife + '\'' +
                '}';
    }
}
