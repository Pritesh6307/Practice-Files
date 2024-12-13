package q_oops_Concept;

public class BankAccount_Main {
	public static void main(String[] args) {
        // Create a SavingsAccount object with an initial balance of 500
        BankAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(100);
        System.out.println("Final balance in SavingsAccount: $" + savings.getBalance());

        // Create a CurrentAccount object with an initial balance of 1000
        BankAccount current = new CurrentAccount(1000);
        current.deposit(500);
        current.withdraw(200);
        System.out.println("Final balance in CurrentAccount: $" + current.getBalance());
    }
}



