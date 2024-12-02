package q_oops_Concept;

public class F_Poly_Overriding_b extends F_Poly_Overriding_a {

	public void eat() {
		super.eat();
		super.why();
		System.out.println("You are Eating");
	}

	public void why() {
		System.out.println("Why are you Eating ?");
	}

	public static void main(String[] args) {
		F_Poly_Overriding_b obj = new F_Poly_Overriding_b();
		obj.eat();
		obj.why();

	}

}
