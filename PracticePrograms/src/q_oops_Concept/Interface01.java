package q_oops_Concept;

import java.util.Scanner;

public interface Interface01 {
	abstract void area();

	abstract void perimeter();

	default void Display() {

	}
}

class circle1 implements Interface01 {
	@Override
	public void area() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("*******");
		System.out.println("Area = ");
		System.out.println("Please Enter Value of r");
		int a = obj.nextInt();
		System.out.print("Area of circle = " + 3.14 * a * a);
		System.out.println(" This is area of circle");
	}

	@Override
	public void perimeter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Please Enter Value of r");
		int a = sc.nextInt();
		System.out.println("Perimeter of circle = " + 2 * 3.14 * a);
		System.out.println("-----------------------------------");
	}

}

class triangle1 implements Interface01 {
	@Override
	public void area() {
		Scanner tr = new Scanner(System.in);
		System.out.println("Triangle");
		System.out.println("********");
		System.out.println("Area = ");
		System.out.println("Please Enter the value of b");
		int b = tr.nextInt();
		System.out.println("Please Enter the value of h");
		int h = tr.nextInt();
		System.out.println("Area of Triangle = " + 0.5 * b * h);

	}

	@Override
	public void perimeter() {
		Scanner pr = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Please Enter Value of a");
		int a = pr.nextInt();
		System.out.println("Please Enter Value of b");
		int b = pr.nextInt();
		System.out.println("Please Enter value of c");
		int c = pr.nextInt();
		System.out.println("Perimeter of Triangle = " + (a + b + c));
		System.out.println("-----------------------------------");
	}
}

class rectangle1 implements Interface01 {

	@Override
	public void area() {
		Scanner tr = new Scanner(System.in);
		System.out.println("Rectangle");
		System.out.println("********");
		System.out.println("Area = ");
		System.out.println("Please Enter the value of length");
		int l = tr.nextInt();
		System.out.println("Please Enter the value of width");
		int w = tr.nextInt();
		System.out.println("Area of Rectangle = " + l * w);

	}

	@Override
	public void perimeter() {
		Scanner pr = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Please Enter Value of length");
		int l = pr.nextInt();
		System.out.println("Please Enter Value of width");
		int w = pr.nextInt();
		System.out.println("Perimeter of Rectangle = " + 2 * (l + w));
		System.out.println("-----------------------------------");

	}

}

class trapezoid1 implements Interface01 {

	@Override
	public void area() {
		Scanner tr = new Scanner(System.in);
		System.out.println("Trapezoid");
		System.out.println("********");
		System.out.println("Area = ");
		System.out.print("Enter base 1: ");
		int a = tr.nextInt();
		System.out.println("Enter base 2: ");
		int b = tr.nextInt();
		System.out.println("Enter Vertical height: ");
		int h = tr.nextInt();
		System.out.println("Area of Trapezoid = " + (0.5 * ((a + b) * h)));
	}

	@Override
	public void perimeter() {
		Scanner pr = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Please Enter Value of a");
		int a = pr.nextInt();
		System.out.println("Please Enter Value of b");
		int b = pr.nextInt();
		System.out.println("Please Enter value of c");
		int c = pr.nextInt();
		System.out.println("Please Enter value of d");
		int d = pr.nextInt();
		System.out.println("Perimeter of Triangle = " + (a + b + c + d));
		System.out.println("-----------------------------------");

	}

}
