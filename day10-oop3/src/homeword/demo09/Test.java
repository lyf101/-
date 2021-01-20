package homeword.demo09;

/**
 * Date:2021/1/20 20:36
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) {
        NetworkOperator networkOperator = null;

        networkOperator = new ChinaMobile("TD-LTE");
        networkOperator.installBroadband();
        networkOperator.installCableTV();

        networkOperator = new ChinaTelecom("LTE");
        networkOperator.installBroadband();
        networkOperator.installCableTV();

        networkOperator = new ChinaUnicom("WCDMA");
        networkOperator.installBroadband();
        networkOperator.installCableTV();
    }
}
