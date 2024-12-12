package q_oops_Concept;

public abstract class G_Vehicle_Abstract {
	// Abstract class representing a general vehicle
	
	    // Abstract method (doesn't have a body)
	    abstract void start();
	    abstract void stop();
	    
	    // Concrete method
	    void fuelUp() {
	        System.out.println("The vehicle is being fueled up.");
	    }
	    
	    // Concrete method with a default implementation
	    void displayInfo() {
	        System.out.println("This is a general vehicle.");
	    }
	}

	// Car class inherits from Vehicle
	class Car extends G_Vehicle_Abstract {
	    // Implementing the abstract methods from Vehicle
	    void start() {
	        System.out.println("The car is starting with a key.");
	    }

	    void stop() {
	        System.out.println("The car is stopping with a brake.");
	    }

	    // Overriding the displayInfo method
	    @Override
	    void displayInfo() {
	        System.out.println("This is a car. It runs on roads.");
	    }
	}

	// Bike class inherits from Vehicle
	class Bike extends G_Vehicle_Abstract {
	    // Implementing the abstract methods from Vehicle
	    void start() {
	        System.out.println("The bike is starting with a button.");
	    }

	    void stop() {
	        System.out.println("The bike is stopping with a pedal brake.");
	    }

	    // Overriding the displayInfo method
	    @Override
	    void displayInfo() {
	        System.out.println("This is a bike. It is powered by pedaling.");
	    }
	}

	// Truck class inherits from Vehicle
	class Truck extends G_Vehicle_Abstract {
	    // Implementing the abstract methods from Vehicle
	    void start() {
	        System.out.println("The truck is starting with a heavy-duty key.");
	    }

	    void stop() {
	        System.out.println("The truck is stopping with air brakes.");
	    }

	    // Overriding the displayInfo method
	    @Override
	    void displayInfo() {
	        System.out.println("This is a truck. It is used for transporting goods.");
	    }
	}

	