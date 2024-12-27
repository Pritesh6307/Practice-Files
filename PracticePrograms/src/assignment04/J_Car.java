package assignment04;

interface J_Car {

	default void start() {
	}
}

class Sedan implements J_Car {

	@Override
	public void start() {
		System.out.println("Sedan is starting");
	}
}
