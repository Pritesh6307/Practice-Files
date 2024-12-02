package q_oops_Concept;

import java.util.Scanner;

public class C_Multi_C_and_Main extends C_Multi_B{
	
	public void c() {
		System.out.println("This is Multiplication");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P");
		int p = sc.nextInt();
		System.out.println("Enter Q");
		int q = sc.nextInt();
		int mult = p*q;
		System.out.println("Multiplication = " + mult);
		
		
	}

	public static void main(String[] args) {
		C_Multi_C_and_Main obj = new C_Multi_C_and_Main();
		
		obj.a();
		obj.b();
		obj.c();
	}

}
