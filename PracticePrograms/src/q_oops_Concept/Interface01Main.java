package q_oops_Concept;

import java.util.Scanner;

public class Interface01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Geometrical shape to calculate area and Perimeter");
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("3. Trapezoid");
		System.out.print("Enter your choice (1 to 4): ");
		System.out.println();
		int choice = sc.nextInt();
		boolean validChoice = true;

		switch (choice) {
		case 1:
			Interface01 circle1 = new circle1();
			circle1.area();
			circle1.perimeter();
			break;
		case 2:
			Interface01 triangle1 = new triangle1();
			triangle1.area();
			triangle1.perimeter();
			break;
		case 3:
			Interface01 rectangle1 = new rectangle1 ();
			rectangle1.area();
			rectangle1.perimeter();
			break;
		case 4:
			Interface01 trapezoid1 = new trapezoid1 ();
			trapezoid1.area();
			trapezoid1.perimeter();
			break;


		default:
			System.out.println("Invalid choice! Please select a number between 1 to 4.");
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