package q_oops_Concept;

import java.util.Scanner;

public class B_Addition {
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = sc.nextInt();
		System.out.println("Enter Value of B");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Addition = " + sum);
		
		sc.close();
		
	}

}
