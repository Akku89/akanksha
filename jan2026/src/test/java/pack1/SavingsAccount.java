package pack1;

class SavingsAccount extends Account {
	 
    private final double MIN_BALANCE = 500;
 
    public SavingsAccount(double balance) {
        super(balance);
    }
 
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal denied! Minimum balance of 500 must be maintained.");
            return false;
        }
    }
}