package practicePrograms;

import java.util.Scanner;

public class U_StringCompare {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = obj.next().toString();
		System.out.println("Enter Second String");
		String str2 = obj.next().toString();
		
		if (str1.equals(str2)) {
			System.out.println("Strings are Equal");
			
		}
		else {
			System.out.println("Strings are Not Equal");
		}
		obj.close();

	}

}
