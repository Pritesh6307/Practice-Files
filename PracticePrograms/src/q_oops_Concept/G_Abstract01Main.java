package q_oops_Concept;

public class G_Abstract01Main extends G_Abstract01 {

	public static void main(String[] args) {

		G_Abstract01Main obj = new G_Abstract01Main();
		obj.a();
		obj.eat();

	}

	@Override
	void eat() {
		System.out.println("Abstract Method");

	}

}
