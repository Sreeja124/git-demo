public class Transactions {
    private double balance;
    private double interest;

    public Transactions(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public double withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }

    public double deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double checkBalance(){
        return balance;
    }

    public double checkInterest(){
        double interest_amount = (balance * interest * 12 )/100;
        return interest_amount;
    }
}
