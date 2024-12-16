package q_oops_Concept;

import java.util.Scanner;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Geometrical shape");
		System.out.println("1. Circle");
		System.out.println("2.Triangle");
		System.out.println("3. Rectangle");
		System.out.println("Enter your choice (1,2 or 3)");
		int choice = sc.nextInt();
		boolean validChoice = true;

		switch (choice) {
		case 1:
			System.out.println("Circle Operations : ");
			System.out.println("1.Calculate Area");
			System.out.println("2.Calculate Perimeter");
			System.out.println("3.Calculate Volume");
			System.out.println("Enter your choice (1,2 or 3)");
			int circleChoice = sc.nextInt();

			switch (circleChoice) {
			case 1:
				circle02 circle02 = new circle02();
				circle02.area();
				break;
			case 2:
				circle02 circle021 = new circle02();
				circle021.perimeter();
				break;
			case 3:
				circle02 circle0211 = new circle02();
				circle0211.volume();
				break;
			default:
				System.out.println("Invalid Choice !");
				validChoice = false;

			}
			break;
		case 2:
			System.out.println("Triangle Operations : ");
			System.out.println("1.Calculate Area");
			System.out.println("2.Calculate Perimeter");
			System.out.println("3.Calculate Volume");
			System.out.println("Enter your choice (1,2 or 3)");
			int TriangleChoice = sc.nextInt();

			switch (TriangleChoice) {
			case 1:
				triangle02 triangle1 = new triangle02();
				triangle1.area();
				break;
			case 2:
				triangle02 triangle2 = new triangle02();
				triangle2.perimeter();
				break;
			case 3:
				triangle02 triangle3 = new triangle02();
				triangle3.volume();
			default:
				System.out.println("Invalid Choice !");
				validChoice = false;
			}
			break;
		case 3:
			System.out.println("Rectangle Operations : ");
			System.out.println("1.Calculate Area");
			System.out.println("2.Calculate Perimeter");
			System.out.println("3.Calculate Volume");
			System.out.println("Enter your choice (1,2 or 3)");
			int rectangleChoice = sc.nextInt();

			switch (rectangleChoice) {
			case 1:
				rectangle02 rec = new rectangle02();
				rec.area();
				break;
			case 2:
				rectangle02 rec1 = new rectangle02();
				rec1.perimeter();
				break;
			case 3:
				rectangle02 rec2 = new rectangle02();
				rec2.volume();
				break;
			default:
				System.out.println("Invalid Choice !");
				validChoice = false;
			}
			break;
		default:
			System.out.println("Invalid Choice !");
			validChoice = false;
		}

		if (validChoice) {
			System.out.println("Operation completed successfully");
		} else {
			System.out.println("Operation Failed.");
		}

	}

}
