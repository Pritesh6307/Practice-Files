package q_oops_Concept;

public class BankAccountMian extends BankAccount {

	public static void main(String[] args) {
		BankAccountMian ba = new BankAccountMian();
		ba.SavingsAccount();
		ba.CurrentAccount();
		ba.accountnumber();
		ba.balance();

	}

	@Override
	void accountnumber() {
		System.out.println("Account number");

	}

	@Override
	void balance() {
		System.out.println("Balance");

	}

}
