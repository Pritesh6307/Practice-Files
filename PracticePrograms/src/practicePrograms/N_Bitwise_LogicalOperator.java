package practicePrograms;

public class N_Bitwise_LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		// Logical Operator
		System.out.println(a > b && a > c); // false
		System.out.println(b > a && a < c); // True
		System.out.println(a < b && b > c); // false
		System.out.println(a == b && c < a); // false

		// Bitwise Operator
		System.out.println(c > a & b < a); // false
		System.out.println(a < b & b < c); // true
		System.out.println(c > a & b > a); // true
		System.out.println(a > b & c < a); // false
		System.out.println(a == b & a < c); // true
	}

}
