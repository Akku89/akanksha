package pack1;
class CurrentAccount extends Account {
	 
    private double overdraftLimit;
 
    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }
 
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
            return false;
        }
    }
}
