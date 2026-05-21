// Write a program to check whether a number is even or odd.

import java.util.Scanner;

public class q1 {


	


	static void check() {
		// take input
		 Scanner sc = new Scanner(System.in);

		int n ;
		System.out.printf("enter the number : ");
		n = sc.nextInt();
	
		// check and print , number is even or odd
		
		if(n % 2 == 0) {
			System.out.printf("number is even");
		}
		
		else		{
			System.out.printf("number is odd");
		}
	}

	public static void main(String args[]) {
	
		check();	
	}

}