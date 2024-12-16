package q_oops_Concept;

class Demo {
	private int value;
	private int value1;

	public void set(int x, int y) {
		value = x;
		value1 = y;
	}

	public int get() {
		return value + value1;

	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.set(10, 20);
		System.out.println(obj.get());

	}
}
