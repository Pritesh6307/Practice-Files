package assignment04;

class E_Human1 implements E_Mammal {

	@Override
	public void eat() {
		System.out.println("Human is Eating");

	}

	@Override
	public void giveBirth() {
		System.out.println("Human giving Birth");

	}

}

public class E_Human {
	public static void main(String[] args) {
		E_Human1 hm = new E_Human1();
		hm.eat();
		hm.giveBirth();
	}
}