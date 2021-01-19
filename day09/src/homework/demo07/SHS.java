package homework.demo07;

/**
 * Date:2021/1/19 19:33
 * Author:lyf
 */
public class SHS extends Prentice {
    private String sandRiver;
    private void pickUpLuge(){
        System.out.println(super.getName()+"挑行李");
    }

    public String getSandRiver() {
        return sandRiver;
    }

    public void setSandRiver(String sandRiver) {
        this.sandRiver = sandRiver;
    }

    @Override
    public String toString() {
        return super.toString()+"SHS{" +
                "sandRiver='" + sandRiver + '\'' +
                '}';
    }
}
