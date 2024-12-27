package assignment04;

public interface B_Drawable {

	abstract void Draw();

}

class Circle implements B_Drawable {

	@Override
	public void Draw() {
		System.out.println("Circle");

	}

}

class Rectangle implements B_Drawable {

	@Override
	public void Draw() {
		System.out.println("Rectangle");

	}

}

class Triangle implements B_Drawable {

	@Override
	public void Draw() {
		System.out.println("Triangle");

	}

}
