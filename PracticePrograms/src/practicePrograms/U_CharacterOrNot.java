package practicePrograms;

import java.util.Scanner;

public class U_CharacterOrNot {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Value");
		char ch = obj.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Its an alphabet");

		} else {
			System.out.println("Not an Alphabet");
		}
		obj.close();
	}

}
