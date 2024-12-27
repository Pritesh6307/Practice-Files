package assignment04;

public class I_InterfaceA_Main {
	public static void main(String[] args) {
		Test test = new Test();
		test.display();
	}
}


//A method signature conflict occurs when
//a class implements or inherits multiple methods 
//with the same name and parameter
//from different sources, such as interfaces or parent classes.
//Since Java does not support multiple inheritance of classes
//but allows multiple interface implementations,
//this situation can lead to ambiguity.