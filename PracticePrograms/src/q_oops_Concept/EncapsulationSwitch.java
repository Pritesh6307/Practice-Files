package q_oops_Concept;

import java.util.Scanner;

class ABCD1 {
	private int A; // Radius of the Circle
	private int B; // Base of the Triangle
	private int H; // Height of the Triangle
	private int C; // Side 1 of the Triangle
	private int D; // Side 2 of the Triangle
	private int E; // Side 3 of the Triangle

	public void Circle(int a) {
		A = a;
	}

	public void TriangleArea1(int b, int h) {
		B = b;
		H = h;
	}

	public void TrianglePerimeter(int c, int d, int e) {
		C = c;
		D = d;
		E = e;
	}

	public double CircleArea() {
		return Math.PI * A * A;
	}

	public double CirclePerimeter() {
		return 2 * Math.PI * A;
	}

	public double TriangleArea() {
		return 0.5 * B * H;
	}

	public int TrianglePerimeter1() {
		return B + H + C;
	}
}

public class EncapsulationSwitch {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		ABCD1 abc = new ABCD1();

		while (true) {
			System.out.println("Choose an operation:");
			System.out.println("1. Calculate Circle Area");
			System.out.println("2. Calculate Circle Perimeter");
			System.out.println("3. Calculate Triangle Area");
			System.out.println("4. Calculate Triangle Perimeter");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = obj.nextInt();

			switch (choice) {
			case 1: // Circle Area
				System.out.println("Enter the radius of the circle:");
				int radius = obj.nextInt();
				abc.Circle(radius);
				System.out.println("Area of Circle = " + abc.CircleArea());
				break;

			case 2: // Circle Perimeter
				System.out.println("Enter the radius of the circle:");
				int radiusPerimeter = obj.nextInt();
				abc.Circle(radiusPerimeter);
				System.out.println("Perimeter of Circle = " + abc.CirclePerimeter());
				break;

			case 3: // Triangle Area
				System.out.println("Enter the base of the triangle:");
				int base = obj.nextInt();
				System.out.println("Enter the height of the triangle:");
				int height = obj.nextInt();
				abc.TriangleArea1(base, height);
				System.out.println("Area of Triangle = " + abc.TriangleArea());
				break;

			case 4: // Triangle Perimeter
				System.out.println("Enter the base of the triangle:");
				int triangleBase = obj.nextInt();
				System.out.println("Enter the first side of the triangle:");
				int side1 = obj.nextInt();
				System.out.println("Enter the second side of the triangle:");
				int side2 = obj.nextInt();
				abc.TrianglePerimeter(side1, side2, triangleBase);
				System.out.println("Perimeter of Triangle = " + abc.TrianglePerimeter1());
				break;

			case 5:
				System.out.println("Exiting program...");
				obj.close();
				return;

			default:
				System.out.println("Invalid choice! Please enter a number between 1 to 5.");
			}

			System.out.println("Do you want to perform another operation? (yes/no)");
			String continueChoice = obj.next();
			if (continueChoice.equalsIgnoreCase("no")) {
				System.out.println("Exiting program.");
				break;
			}
		}
	}
}
