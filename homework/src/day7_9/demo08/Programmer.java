package day7_9.demo08;

/**
 * Date:2021/2/8 10:47
 * Author:lyf
 */
public class Programmer {
    private int netInCome;

    public void eat(int money) {
        this.netInCome = this.netInCome - money;
    }

    public void payRent(int money) {
        this.netInCome = this.netInCome - money;
    }

    public void seeMovie(int money) {
        this.netInCome = this.netInCome - money;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "netInCome=" + netInCome +
                '}';
    }

    public int getNetInCome() {
        return netInCome;
    }

    public void setNetInCome(int netInCome) {
        this.netInCome = netInCome;
    }
}
