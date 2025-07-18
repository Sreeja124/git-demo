public abstract class Transactions {
    private double balance;
    private double interest;

    public Transactions(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public abstract double checkBalance();

    public abstract double checkInterest();
}
