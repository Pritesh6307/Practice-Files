package practicePrograms;

import java.util.Scanner;

public class V_Looping_DoWhile {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number");
		int i = obj.nextInt();

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		obj.close();
	}

}
