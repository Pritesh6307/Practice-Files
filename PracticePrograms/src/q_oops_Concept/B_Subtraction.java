package q_oops_Concept;

import java.util.Scanner;

public class B_Subtraction extends B_Addition {
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = sc.nextInt();
		System.out.println("Enter Value of B");
		int b = sc.nextInt();
		int sub = a-b;
		System.out.println("Subtraction = " + sub);
		
		sc.close();
	}

}
