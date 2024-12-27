package assignment04;

public interface C_Shape {
	abstract void draw();

	abstract void area();

}

class circle implements C_Shape {

	@Override
	public void draw() {
		System.out.println("This is Circle");

	}

	@Override
	public void area() {
		int r = 10;
		System.out.println("Area of Circle = " + 3.14*r*r);

	}

}