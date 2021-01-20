package homeword.demo09;

/**
 * Date:2021/1/20 20:26
 * Author:lyf
 */
public class NetworkOperator implements IInternet,ICall{
    private String type;

    public void installBroadband() {
        System.out.println(getType()+"安装了宽带");
    }


    public void installCableTV() {
        System.out.println(getType()+"安装了有线电视");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
