package q_oops_Concept;

public interface H_Interface01 {
	abstract void Sound();
	
	default void sleep() {
		System.out.println("The Animal is Sleeping");
	}

}
class cat implements H_Interface01 {

	@Override
	public void Sound() {
		System.out.println("Meow!");
		
	}
	
}
class dog implements H_Interface01 {

	@Override
	public void Sound() {
		System.out.println("Woof!");		
	}
	
}
