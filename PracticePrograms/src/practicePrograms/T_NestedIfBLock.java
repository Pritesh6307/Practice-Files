package practicePrograms;

import java.util.Scanner;

public class T_NestedIfBLock {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = obj.nextInt();
		System.out.println("Enter Value of B");
		int b = obj.nextInt();

		if (a < b) {

			if (b < a) {
				System.out.println("A is Greater");
			} else {
				System.out.println("A is Lesser");

			}
		} else {
			System.out.println("B is Greater");
		}
		obj.close();
	}

}
