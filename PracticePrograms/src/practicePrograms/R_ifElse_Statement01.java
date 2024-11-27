package practicePrograms;

import java.util.Scanner;

public class R_ifElse_Statement01 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Value");
		int a = obj.nextInt();
		
		if (a/2 == 0) {
			System.out.println("a is equal to zero");
			
		}else {
			System.out.println("a is not equal to zero");
		}
		obj.close();

	}

}
