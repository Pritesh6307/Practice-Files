package practicePrograms;

import java.util.Scanner;

public class V_LoopingFor02 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = obj.nextInt();
		
		for(int i=1; i<=10;i++) {
			System.out.println(a*i);
		}
		obj.close();

	}

}
