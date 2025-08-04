package oops;

public  class FixedDeposit extends Transactions {
    public FixedDeposit(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public double checkInterest() {
        return ( getBalance()* interest * 1) / 100;
    }

    @Override
    public double checkBalance() {
        if(getBalance()<1000000){
            System.out.println("Insufficient funds for fixed deposit");
            return 0;
        }
        return getBalance();
    }
}
