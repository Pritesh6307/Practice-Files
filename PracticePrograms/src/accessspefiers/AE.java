package accessspefiers;

class AE1 {

	private int p = 100;
	public int q = 200;
	int r = 300;
	protected int s = 400;

	public void test() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
	}
}

public class AE {

	public static void main(String[] args) {
		AE1 obj = new AE1();
		obj.test();

	}

}
