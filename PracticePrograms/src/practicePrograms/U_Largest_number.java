package practicePrograms;

import java.util.Scanner;

public class U_Largest_number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of A");
		int a = obj.nextInt();
		System.out.println("Enter value of B");
		int b = obj.nextInt();
		System.out.println("Enter value of C");
		int c = obj.nextInt();

		if (a > b && a > c) {
			System.out.println("A is Greater");

		} else if (b > a && b > c) {
			System.out.println("B is Greater");

		} else {
			System.out.println("C is Greater");
		}
		obj.close();

	}

}
