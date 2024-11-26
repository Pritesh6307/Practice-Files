package practicePrograms;

public class M_UnaryOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		System.out.println(++a - ++b); // 21-11=10
		System.out.println(--b + ++a); // 10+22=32
		System.out.println(++b - --a); // 11-21=-10
		System.out.println(--a + ++b); // 20+12=32
		System.out.println(a++ - --b); // 20(21)-11=9
		System.out.println(b-- + a++); // 11(10) +21(22) =32
		System.out.println(b++ - ++a); // 10(11) - 23 = -13
		System.out.println(a); //23
		System.out.println(b); //11

	}

}
