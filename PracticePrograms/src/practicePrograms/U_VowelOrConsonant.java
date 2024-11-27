package practicePrograms;

import java.util.Scanner;

public class U_VowelOrConsonant {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = obj.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' 
				|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Its an Vowel");
		} else {
			System.out.println("Its a Consonant");
		}
		obj.close();
	}

}
