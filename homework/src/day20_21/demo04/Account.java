package day20_21.demo04;

/**
 * Date:2021/2/21 10:07
 * Author:lyf
 */
public class Account {
    private double balance;

    public void withDrawal(double dAmount) throws InsufficientFundsException, NagativeFundsException {
        if (dAmount>this.balance){
            throw new InsufficientFundsException("取款得数额大于存款");
        }else if (dAmount<0){
            throw new NagativeFundsException("取款数额为负数");
        }
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
