package homework.demo002;

/**
 * Date:2021/2/2 10:34
 * Author:lyf
 */
public class Test {
    public static void main(String[] args) throws NagativeFundsException, InsufficientFundsException {
        Account account = new Account(1000);
        System.out.println(account.getBalance());

        account.withDrawal(-2000);
        System.out.println(account.getBalance());
    }
}
