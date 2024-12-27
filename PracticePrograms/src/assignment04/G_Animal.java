package assignment04;

public interface G_Animal {

	void Sound();

}

class Dog implements G_Animal {

	@Override
	public void Sound() {
		System.out.println("Sound of Dog");

	}

}
