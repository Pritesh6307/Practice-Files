package practicePrograms;

import java.util.Scanner;

public class S_IfElse_Ladder {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = obj.nextInt();
		System.out.println("Enter Value of B");
		int b = obj.nextInt();
		if (a>b) {
			System.out.println("A is Greater than B");
		}
		else if (a==b){
			System.out.println("A is equal to B");
		}
		else {
			System.out.println("A is less than B");
		}
	}

}
