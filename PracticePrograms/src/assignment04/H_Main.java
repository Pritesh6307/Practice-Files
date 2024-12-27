package assignment04;

public class H_Main {

	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard();
		PayPal pp = new PayPal();
		
		cc.makePayment();
		pp.makePayment();
		System.out.println("******************************************");
		System.out.println();
		System.out.println("Demonstrate polymorphism where the same interface can be used with different classes.\r\n"
				+ "\r\n"
				+ "Polymorphism\r\n"
				+ "--------------\r\n"
				+ "When we perform one task in multiple ways that is known as Polymorphism.\r\n"
				+ "\r\n"
				+ "# The Payment interface has a method makePayment(),\r\n"
				+ "  which is implemented by different classes.\r\n"
				+ "# CreditCard & PayPal all implement the Payment interface,\r\n"
				+ "  providing their own implementation of the makePayment() method.\r\n"
				+ "# In the Main class, an Payment reference is used to hold objects of CreditCard & PayPal.\r\n"
				+ "  Calling the same method makePayment(),");

	}

}
