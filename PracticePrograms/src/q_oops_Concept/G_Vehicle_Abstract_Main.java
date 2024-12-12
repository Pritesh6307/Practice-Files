package q_oops_Concept;

public class G_Vehicle_Abstract_Main extends G_Vehicle_Abstract{
	// Main class to test the system
		
		    public static void main(String[] args) {
		        // Creating objects of each concrete class
		        G_Vehicle_Abstract car = new Car();
		        G_Vehicle_Abstract bike = new Bike();
		        G_Vehicle_Abstract truck = new Truck();

		        // Testing the methods of the objects
		        System.out.println("Testing Car:");
		        car.displayInfo();
		        car.start();
		        car.fuelUp();
		        car.stop();

		        System.out.println("\nTesting Bike:");
		        bike.displayInfo();
		        bike.start();
		        bike.fuelUp();
		        bike.stop();

		        System.out.println("\nTesting Truck:");
		        truck.displayInfo();
		        truck.start();
		        truck.fuelUp();
		        truck.stop();
		    }

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
		}

