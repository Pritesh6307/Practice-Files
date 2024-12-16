package q_oops_Concept;

import java.util.Scanner;

class Demo1 {
	private int P;
	private int Q;

	public void set(int x, int y) {
		P = x;
		Q = y;

	}

	public int get() {
		return P + Q;

	}
}

public class Encapsulation1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		Demo1 xyz = new Demo1();
		System.out.println("Enter first value");
		int x = obj.nextInt();
		System.out.println("Enter Second value");
		int y = obj.nextInt();
		System.out.println("Addition of Two Numbers");
		xyz.set(x, y);
		System.out.println(xyz.get());

	}

}
