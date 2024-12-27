package assignment04;

public abstract class F_Vehicle {
	abstract void A();	

}
class start extends F_Vehicle{

	@Override
	void A() {
		System.out.println("Vehicle is Starting");
		
	}
}
