package practice_new;

import java.util.Scanner;

public class LoopingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int a = sc.nextInt();
		for(int i = 1; i<=10; i++) {
			
				System.out.println(a*i);
			}
		}

	}

