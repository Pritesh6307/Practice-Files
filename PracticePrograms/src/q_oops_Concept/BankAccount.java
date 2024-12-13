package q_oops_Concept;

public abstract class BankAccount {// Abstract class BankAccount
	
	    // Instance variables
	    protected double balance;

	    // Constructor to initialize balance
	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    // Abstract method for deposit
	    public abstract void deposit(double amount);

	    // Abstract method for withdrawal
	    public abstract void withdraw(double amount);

	    // Method to get the current balance
	    public double getBalance() {
	        return balance;
	    }
	}

	// Subclass SavingsAccount extending BankAccount
	class SavingsAccount extends BankAccount {

	    // Constructor to initialize balance for SavingsAccount
	    public SavingsAccount(double balance) {
	        super(balance);
	    }

	    // Implement deposit method for SavingsAccount
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount + " to SavingsAccount. New balance: $" + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Implement withdraw method for SavingsAccount
	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + " from SavingsAccount. New balance: $" + balance);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal amount.");
	        }
	    }
	}

	// Subclass CurrentAccount extending BankAccount
	class CurrentAccount extends BankAccount {

	    // Constructor to initialize balance for CurrentAccount
	    public CurrentAccount(double balance) {
	        super(balance);
	    }

	    // Implement deposit method for CurrentAccount
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount + " to CurrentAccount. New balance: $" + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Implement withdraw method for CurrentAccount
	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + " from CurrentAccount. New balance: $" + balance);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal amount.");
	        }
	    }
	}

	// Main class to test the BankAccount, SavingsAccount, and CurrentAccount
	
