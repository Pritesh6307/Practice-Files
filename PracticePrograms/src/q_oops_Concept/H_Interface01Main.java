package q_oops_Concept;

public class H_Interface01Main implements H_Interface01 {

	public static void main(String[] args) {

		H_Interface01 dog = new dog();
		H_Interface01 cat = new cat();

		dog.Sound();
		dog.sleep();

		cat.Sound();
		cat.sleep();

	}

	@Override
	public void Sound() {

	}

}
