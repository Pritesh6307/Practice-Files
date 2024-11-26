package practicePrograms;

import java.util.Scanner;

public class G_AdditionDemo_Scanner {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = obj.nextInt();
		System.out.println("Enter Second Number");
		int b = obj.nextInt();
		int sum = a + b;
		System.out.println("Addition of 2 Numbers = " + sum);
	}

}
