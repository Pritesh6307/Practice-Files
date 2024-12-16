package q_oops_Concept;

import java.util.Scanner;

public class Interface01Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Geometrical shape to calculate area and Perimeter");
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("4. Trapezoid");
		System.out.println("Enter your choice (1 to 4): ");
		System.out.println("------------------------------");
		int choice = sc.nextInt();
		boolean validChoice = true;

		switch (choice) {
		case 1:
			System.out.println("> Circle Operations:");
			System.out.println("----------------------");
			System.out.println("1. Calculate Area");
			System.out.println("2. Calculate Perimeter");
			System.out.print("Enter your choice (1 or 2): ");
			int circleChoice = sc.nextInt();
			switch (circleChoice) {
			case 1:
				Interface01 circle1 = new circle1();
				circle1.area();
				break;
			case 2:
				Interface01 circle2 = new circle1();
				circle2.perimeter();
				break;
			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
				validChoice = false;
			}
			break;
		case 2:
			System.out.println("> Triangle Operations:");
			System.out.println("----------------------");
			System.out.println("1. Calculate Area");
			System.out.println("2. Calculate Perimeter");
			System.out.print("Enter your choice (1 or 2): ");
			int triangleChoice = sc.nextInt();
			switch (triangleChoice) {
			case 1:
				Interface01 triangle1 = new triangle1();
				triangle1.area();
				break;
			case 2:
				Interface01 triangle2 = new triangle1();
				triangle2.perimeter();
				break;
			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
				validChoice = false;
			}
			break;
		case 3:
			System.out.println("> Rectangle Operations:");
			System.out.println("----------------------");
			System.out.println("1. Calculate Area");
			System.out.println("2. Calculate Perimeter");
			System.out.print("Enter your choice (1 or 2): ");
			int rectangleChoice = sc.nextInt();
			switch (rectangleChoice) {
			case 1:
				Interface01 rectangle1 = new rectangle1();
				rectangle1.area();
				break;
			case 2:
				Interface01 rectangle2 = new rectangle1();
				rectangle2.perimeter();
				break;
			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
				validChoice = false;
			}
			break;
		case 4:
			System.out.println("> Trapezoid Operations:");
			System.out.println("----------------------");
			System.out.println("1. Calculate Area");
			System.out.println("2. Calculate Perimeter");
			System.out.print("Enter your choice (1 or 2): ");
			int trapezoidChoice = sc.nextInt();
			switch (trapezoidChoice) {
			case 1:
				Interface01 trapezoid1 = new trapezoid1();
				trapezoid1.area();
				break;
			case 2:
				Interface01 trapezoid2 = new trapezoid1();
				trapezoid2.perimeter();
				break;
			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
				validChoice = false;
			}
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
