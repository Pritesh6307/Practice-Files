package practice_new;

class Inheritance2 {

	public void A() {
		System.out.println("Test");
	}
}
	public class Inheritance3 extends Inheritance2 {

		public static void main(String[] args) {
			Inheritance3 obj = new Inheritance3();
			obj.A();

		}
		
	}