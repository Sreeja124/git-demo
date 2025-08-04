package oops;

public class SavingsAccount extends Transactions {

    public SavingsAccount(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public double checkInterest() {
        return ( getBalance()* interest * 1) / 100;
    }
    @Override
    public double getBalance() {
        return 100;
    }
    @Override
    public double checkBalance() {
        return super.getBalance();
        //return getBalance();
    }
}
