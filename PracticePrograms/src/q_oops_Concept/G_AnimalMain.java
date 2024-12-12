package q_oops_Concept;

public class G_AnimalMain extends G_Animal {
	// Main class to test the system

	public static void main(String[] args) {
		// Creating objects of Dog and Cat
		G_Animal dog = new Dog();
		G_Animal cat = new Cat();

		// Testing the methods of the objects
		System.out.println("Dog:");
		dog.makesound();
		dog.sleep();

		System.out.println("\nCat:");
		cat.makesound();
		cat.sleep();
	}

	@Override
	void makesound() {
		// TODO Auto-generated method stub

	}
}
