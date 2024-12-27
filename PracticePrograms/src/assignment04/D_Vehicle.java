package assignment04;

public interface D_Vehicle {

	default void Start(){
		
	}

}

class Car implements D_Vehicle {

	@Override
	public void Start() {
		System.out.println("Starting a Car");
		
		
	} 
	
	
}
