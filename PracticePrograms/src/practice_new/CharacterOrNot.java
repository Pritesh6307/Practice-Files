package practice_new;

import java.util.Scanner;

public class CharacterOrNot {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character");
		char ch = sc.next().charAt(0);
		
		if ((ch >='a' && ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("Its an Alphabet");
			
		}
		else if
			(ch >= '0' || ch<= '9') {
			System.out.println("Its an Number");
		}
		else {
			System.out.println("Its an Special Character");
		}
	}

}
