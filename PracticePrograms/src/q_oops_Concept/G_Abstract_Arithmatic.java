package q_oops_Concept;

import java.util.Scanner;

public class G_Abstract_Arithmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int choice = sc.nextInt();
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		int result = 0;
		boolean validChoice = true;

		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Result of addition: " + result);
			break;

		case 2:
			result = num1 - num2;
			System.out.println("Result of subtraction: " + result);
			break;

		case 3:
			result = num1 * num2;
			System.out.println("Result of multiplication: " + result);
			break;

		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result of division: " + result);
			} else {
				System.out.println("Error: Cannot divide by zero.");
				validChoice = false;
			}
			break;

		default:
			System.out.println("Invalid choice. Please choose between 1-4.");
			validChoice = false;
		}

		if (validChoice) {
			System.out.println("Operation completed successfully.");
		} else {
			System.out.println("Operation failed.");
		}

		sc.close();
	}
}
