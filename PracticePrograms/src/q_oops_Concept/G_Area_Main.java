package q_oops_Concept;

import java.util.Scanner;

public class G_Area_Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Geometrical shape to calculate area:");
		System.out.println("1. Rectangle");
		System.out.println("2. Triangle");
		System.out.println("3. Circle");
		System.out.println("4. Trapezoid");
		System.out.print("Enter your choice (1-4): ");
		System.out.println();
		int choice = sc.nextInt();
		boolean validChoice = true;

		switch (choice) {
		case 1:
			G_Area rectangle = new Rectangle();
			rectangle.Calculate();
			break;
		case 2:
			G_Area triangle = new Triangle();
			triangle.Calculate();
			break;
		case 3:
			G_Area circle = new Circle();
			circle.Calculate();
			break;
		case 4:
			G_Area trapezoid = new Trapezoid();
			trapezoid.Calculate();
			break;
		default:
			System.out.println("Invalid choice! Please select a number between 1 and 4.");
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