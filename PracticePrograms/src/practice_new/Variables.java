package practice_new;

public class Variables {

	int a = 10;
	static char ch = 'A';

	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		int b = 20;
		System.out.println(ch);
		System.out.println(b);

		Variables obj = new Variables();

		System.out.println(obj.a);
		obj.test();
	}
}