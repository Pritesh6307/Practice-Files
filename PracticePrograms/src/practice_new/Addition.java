package practice_new;
 public class Addition{
	 public void sum(int a, int b, int c) {
			System.out.println(a + b + c);
		}

		public void sub(int a, int b, int c) {
			System.out.println(a - b - c);
		}

		public void mult(int a, int b, int c) {
			System.out.println(a * b * c);
		}

		public static void main(String[] args) {
			Overloading obj = new Overloading();
			obj.sum(10, 20, 30);
			obj.sub(400, 200, 100);
			obj.mult(10, 10, 10);

		}

	}
