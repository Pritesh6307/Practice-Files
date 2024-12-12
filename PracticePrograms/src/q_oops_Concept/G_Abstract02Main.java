package q_oops_Concept;

public class G_Abstract02Main extends G_Abstract02 {
	public void AnimalSound() {
		System.out.println("The pig says: wee wee");

	}

	public static void main(String[] args) {
		G_Abstract02Main obj = new G_Abstract02Main();
		obj.AnimalSound();
		obj.Sleep();

	}

}
