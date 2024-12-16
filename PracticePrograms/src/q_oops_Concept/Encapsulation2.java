package q_oops_Concept;

import java.util.Scanner;

class ABCD {
	private int A;
	private int B;
	private int H;
	private int C;
	private int D;
	private int E;

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

public class Encapsulation2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		ABCD abc = new ABCD();
	// circle area
		System.out.println("Circle");
		System.out.println("--------");
		System.out.println("Area of Circle : ");
		System.out.println("Enter Value of Radius");
		int a = obj.nextInt();
		abc.Circle(a);
		System.out.print("Area of Circle = ");
		System.out.println(abc.CircleArea());
		System.out.println("*****************************************");
	// circle perimeter
		System.out.println("Perimeter of Circle");
		System.out.println("Enter value of Radius");
		int b = obj.nextInt();
		abc.Circle(a);
		System.out.print("Perimeter of Circle = ");
		System.out.println(abc.CirclePerimeter());
		System.out.println("*****************************************");
	// area of triangle
		System.out.println("Triangle");
		System.out.println("---------");
		System.out.println("Area of Triangle : ");
		System.out.println("Enter Value of Base");
		int c = obj.nextInt();
		System.out.println("Enter value of Height");
		int d = obj.nextInt();
		abc.TriangleArea1(b, d);
		System.out.print("Area of Triangle = ");
		System.out.println(abc.TriangleArea());
		System.out.println("*****************************************");
	// Perimeter of triangle
		System.out.println("Perimeter of Triangle");
		System.out.println("Enter value of Side 1");
		int p = obj.nextInt();
		System.out.println("Enter value of Side 2");
		int q = obj.nextInt();
		System.out.println("Enter value of Base");
		int r = obj.nextInt();
		abc.TrianglePerimeter(b, r, c);
		System.out.print("Perimeter of Triangle = ");
		System.out.println(abc.TrianglePerimeter1());

	}
}
