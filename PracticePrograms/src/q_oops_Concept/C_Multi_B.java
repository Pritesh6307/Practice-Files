package q_oops_Concept;

import java.util.Scanner;

public class C_Multi_B extends C_Multi_A {
	public void b() {
		System.out.println("This is Subtraction");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int x = sc.nextInt();
		System.out.println("Enter B");
		int y = sc.nextInt();
		int sub = x-y;
		System.out.println("Subtraction = " + sub);
		
		
	}

}
