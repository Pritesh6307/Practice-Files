package practice_new;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		int a = sc.nextInt();

		if (a > 100) {
			System.out.println("A is Greater");

		} else {
			System.out.println("A is Smaller");
		}
	}

}
