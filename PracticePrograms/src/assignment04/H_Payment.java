package assignment04;

public interface H_Payment {
	
	void makePayment();
	

}
class CreditCard implements H_Payment{

	@Override
	public void makePayment() {
		System.out.println("Make a payment by Credit Card");
		
	}
	
}
class PayPal implements H_Payment{

	@Override
	public void makePayment() {
		System.out.println("Make a payment using PayPal");
		
	}
	
}