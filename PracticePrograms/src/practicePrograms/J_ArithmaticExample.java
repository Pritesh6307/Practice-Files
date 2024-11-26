package practicePrograms;

public class J_ArithmaticExample {

	public static void main(String[] args) {
		J_ArithmaticExample ja = new J_ArithmaticExample();
		ja.add();
		ja.sub();
		ja.mult();
		ja.div();
		ja.mod();

	}

	public void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	public void sub() {
		int a = 10;
		int b = 5;
		int sub = a - b;
		System.out.println(sub);
	}

	public void mult() {
		int a = 30;
		int b = 10;
		int mult = a * b;
		System.out.println(mult);
	}

	public void div() {
		int a = 20;
		int b = 10;
		int div = a / b;
		System.out.println(div);
	}

	public void mod() {
		int a = 10;
		int b = 5;
		int mod = a % b;
		System.out.println(mod);
	}

}
