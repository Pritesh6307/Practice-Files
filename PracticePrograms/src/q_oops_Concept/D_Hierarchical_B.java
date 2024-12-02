package q_oops_Concept;

import java.util.Scanner;

public class D_Hierarchical_B extends D_Hierarchical_A {
	
	public void sub() {
		System.out.println("Subtraction");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X");
		int x = sc.nextInt();
		System.out.println("Enter value of Y");
		int y = sc.nextInt();
		int sub = x-y;
		System.out.println("A-B = " + sub);
	}

}
