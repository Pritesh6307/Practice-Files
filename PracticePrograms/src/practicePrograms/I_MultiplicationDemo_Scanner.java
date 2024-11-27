package practicePrograms;

import java.util.Scanner;

public class I_MultiplicationDemo_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number");
		int a = sc.nextInt();
		System.out.println("Second Number");
		int b = sc.nextInt();
		int mult = a * b;
		System.out.println("Multiplication = " + mult);
		
		sc.close();

	}

}
