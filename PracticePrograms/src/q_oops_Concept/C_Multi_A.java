package q_oops_Concept;

import java.util.Scanner;

public class C_Multi_A {
	public void a() {
		System.out.println("This is Addition");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Addition = " + sum);
		
		sc.close();
	}

}
