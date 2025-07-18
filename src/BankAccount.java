public class BankAccount extends Transactions{

    public BankAccount(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public double checkInterest() {
        return ( getBalance()* getInterest() * 1) / 100;
    }

    @Override
    public double checkBalance() {
        return getBalance();
    }
}
