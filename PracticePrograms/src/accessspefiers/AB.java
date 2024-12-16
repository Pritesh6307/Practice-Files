package accessspefiers;

class AB1 {
	public int a = 20;
	protected int b = 30;
	int c = 15;
	private int d = 60;

	public void test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}

public class AB {
	public static void main(String[] args) {
		AB1 obj = new AB1();
		obj.test();

	}

}
