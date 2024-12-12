package practice_new;

public class Overriding02 extends Overriding01{
	
	public void eat() {
		super.eat();
		System.out.println("You are Eating");
	}

	public static void main(String[] args) {
		
		Overriding02 obj = new Overriding02();
		obj.eat();

	}

}
