package pack1;
public class AccountMain {
	 
    public static void main(String[] args) {
 
        Account smith = new SavingsAccount(2000);
        Account kathy = new CurrentAccount(3000, 1000);
 
        smith.deposit(2000);     // Deposit to Smith
        kathy.withdraw(2000);    // Withdraw from Kathy
 
        System.out.println("\nUpdated Account Details:");
        System.out.println("Smith → " + smith);
        System.out.println("Kathy → " + kathy);
    }
}
 