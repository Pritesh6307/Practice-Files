package q_oops_Concept;

import java.util.Scanner;

public class D_Hierarchical_C extends D_Hierarchical_A{
	
	public void multi() {
		System.out.println("Multiplication");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of P");
		int p = sc.nextInt();
		System.out.println("Enter value of Q");
		int q = sc.nextInt();
		int mult = p*q;
		System.out.println("Multiplication = " + mult);
	}

}
