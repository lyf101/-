package homework.demo002;

/**
 * Date:2021/2/2 10:29
 * Author:lyf
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
    }
    public void withDrawal(double dAmount) throws InsufficientFundsException, NagativeFundsException {
        if (dAmount>this.balance){
            throw new InsufficientFundsException("取款超过存款");
        }else if(dAmount<0){
            throw new NagativeFundsException("取款不能为负数");
        }else this.balance = this.balance-dAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
