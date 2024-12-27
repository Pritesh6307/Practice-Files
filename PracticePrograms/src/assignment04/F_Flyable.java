package assignment04;

public interface F_Flyable {
	abstract void Bird();
	abstract void Aeroplane();

}

class Demo implements F_Flyable{

	@Override
	public void Bird() {
		System.out.println("Bird start Flying");
		
	}

	@Override
	public void Aeroplane() {
		System.out.println("Aeroplane is ready to Takeoff");
		
	}
	
}
