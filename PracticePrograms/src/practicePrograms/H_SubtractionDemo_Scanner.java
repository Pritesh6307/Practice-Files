package practicePrograms;

import java.util.Scanner;

public class H_SubtractionDemo_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int sub = a - b;
		System.out.println("Subtraction of 2 Numbers = " + sub);

	}

}
