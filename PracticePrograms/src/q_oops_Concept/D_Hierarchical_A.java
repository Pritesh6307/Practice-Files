package q_oops_Concept;

import java.util.Scanner;

public class D_Hierarchical_A {
	
	public void add() {
		System.out.println("Addition");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		int a = sc.nextInt();
		System.out.println("Enter value of B");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("A+B = " + sum);
	}

}
