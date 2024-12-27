package assignment04;

	//Interface A
public interface I_InterfaceA {
	    void display();
	}

	// Interface B
	interface InterfaceB {
	    void display();
	}

	
	class Test implements I_InterfaceA, InterfaceB {
	    @Override
	    public void display() {
	        System.out.println("Resolving conflict - Display method implemented.");
	    }

	}

