package q_oops_Concept;

import java.util.Scanner;

abstract class G_Area {
	abstract void Calculate();

	void GeometricalAreas() {

	}
}

class Rectangle extends G_Area {
	@Override
	void Calculate() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Rectangle");
		System.out.println("----------------");
		System.out.print("Enter Length: ");
		int length = obj.nextInt();
		System.out.print("Enter Width: ");
		int width = obj.nextInt();
		System.out.println("Area of Rectangle = " + (length * width));
	}
}

class Triangle extends G_Area {
	@Override
	void Calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Triangle");
		System.out.println("----------------");
		System.out.print("Enter Base: ");
		int base = sc.nextInt();
		System.out.print("Enter Height: ");
		int height = sc.nextInt();
		System.out.println("Area of Triangle = " + (0.5 * base * height));
	}
}

class Circle extends G_Area {
	@Override
	void Calculate() {
		Scanner circle = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("----------------");
		System.out.print("Enter Radius: ");
		int r = circle.nextInt();
		System.out.println("Area of Circle = " + (3.14 * r * r));
	}
}

class Trapezoid extends G_Area {
	@Override
	void Calculate() {
		Scanner trapezoid = new Scanner(System.in);
		System.out.println("Trapezoid");
		System.out.println("----------------");
		System.out.print("Enter base 1: ");
		int base1 = trapezoid.nextInt();
		System.out.println("Enter base 2: ");
		int base2 = trapezoid.nextInt();
		System.out.println("Enter Vertical height: ");
		int h = trapezoid.nextInt();
		System.out.println("Area of Trapezoid = " + (0.5 * ((base1 + base2) * h)));
	}
}
