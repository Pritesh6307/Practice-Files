package q_oops_Concept;

import java.util.Scanner;

public interface InterfaceDemo {
	
	abstract void area();
	abstract void perimeter();
	abstract void volume();
	
	default void Display() {
		
	}

}

class circle02 implements InterfaceDemo{

	@Override
	public void area() {
		Scanner obj =new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("-------");
		System.out.println("Area");
		System.out.println("Enter value of Radius");
		int r=obj.nextInt();
		System.out.println("Area of Circle = " + 3.14*r*r);
		System.out.println("This is Area of Circle");
		
	}

	@Override
	public void perimeter() {
		Scanner obj =new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Enter value of Radius");
		int r=obj.nextInt();
		System.out.println("Perimeter of Circle = " + 2*3.14*r);
		System.out.println("This is Perimeter of Circle");
		
	}

	@Override
	public void volume() {
		Scanner obj =new Scanner(System.in);
		System.out.println("Volume");
		System.out.println("Enter Value or Radius");
		int r=obj.nextInt();
		System.out.println("Enter value of Height");
		int h = obj.nextInt();
		System.out.println("Volume of Circle = " + 3.14*r*r*h);
	}
	
}
class triangle02 implements InterfaceDemo{

	@Override
	public void area() {
		Scanner abc = new Scanner(System.in);
		System.out.println("Triangle");
		System.out.println("--------");
		System.out.println("Area");
		System.out.println("Plerase Enter value of Base");
		int b=abc.nextInt();
		System.out.println("Please enter value of height");
		int h = abc.nextInt();
		System.out.println("Area of Triangle = "+ 0.5*b*h);
		
	}

	@Override
	public void perimeter() {
		Scanner abc = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("--------");
		System.out.println("Plerase Enter value of side1");
		int s1=abc.nextInt();
		System.out.println("Please enter value of side2");
		int s2= abc.nextInt();
		System.out.println("Please Enter value of side3");
		int s3=abc.nextInt();
		System.out.println("Perimeter of Triangle = "+ (s1+s2+s3));
		
	}

	@Override
	public void volume() {
		Scanner abc = new Scanner(System.in);
		System.out.println("Volume");
		System.out.println("--------");
		System.out.println("Plerase Enter value of Base");
		int b=abc.nextInt();
		System.out.println("Please enter value of Height");
		int h= abc.nextInt();
		System.out.println("Please Enter value of Length");
		int l=abc.nextInt();
		System.out.println("Volume of Triangle = "+ (0.5*b*h*l));
		
	}
	
}
class rectangle02 implements InterfaceDemo{

	@Override
	public void area() {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Rectangle");
		System.out.println("--------");
		System.out.println("Area");
		System.out.println("Plerase Enter value of Length");
		int l=xyz.nextInt();
		System.out.println("Please enter value of Width");
		int w = xyz.nextInt();
		System.out.println("Area of Rectangle "
				+ "= "+ l*w);
		
	}

	@Override
	public void perimeter() {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Perimeter");
		System.out.println("Plerase Enter value of Length");
		int l=xyz.nextInt();
		System.out.println("Please enter value of Width");
		int w = xyz.nextInt();
		System.out.println("Area of Rectangle = "+ 2*(l+w));

	}

	@Override
	public void volume() {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Volume");
		System.out.println("--------");
		System.out.println("Plerase Enter value of Length");
		int l=xyz.nextInt();
		System.out.println("Please enter value of Height");
		int h= xyz.nextInt();
		System.out.println("Please Enter value of width");
		int w=xyz.nextInt();
		System.out.println("Volume of Triangle = "+ (l*w*h));
		
	}
	
}































