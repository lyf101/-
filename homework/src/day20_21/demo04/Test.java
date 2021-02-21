package day20_21.demo04;

/**
 * Date:2021/2/21 10:11
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) throws NagativeFundsException, InsufficientFundsException {
        Account account = new Account(100);
        account.withDrawal(150);
        account.withDrawal(-15);
    }
}
