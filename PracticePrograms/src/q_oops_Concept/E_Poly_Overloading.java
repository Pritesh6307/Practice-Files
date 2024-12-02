package q_oops_Concept;

public class E_Poly_Overloading {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public void mult(int a,int b, int c) {
		System.out.println(a*b*c);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void sub(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public static void main(String[] args) {
		E_Poly_Overloading obj = new E_Poly_Overloading();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sub(50, 30);
		obj.sub(300, 200, 50);
		obj.mult(10, 20, 15);

	}

}
