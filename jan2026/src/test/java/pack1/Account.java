package pack1;
abstract class Account {
	 
    protected int accNum;
    protected double balance;
    private static int accCounter = 1000;
 
    public Account(double balance) {
        this.accNum = ++accCounter;
        this.balance = balance;
    }
 
    public void deposit(double amount) {
        balance += amount;
    }
 
    public double getBalance() {
        return balance;
    }
 
    // abstract withdraw method
    public abstract boolean withdraw(double amount);
 
    @Override
    public String toString() {
        return "Account Number: " + accNum + ", Balance: " + balance;
    }
}
