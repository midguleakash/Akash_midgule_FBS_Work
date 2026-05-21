// Write a program to check given 3 digit number is pallindrome or not.

import java.util.Scanner;

public class q2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        	// take input number
	int number , d1, d2, d3;
	System.out.printf("enter the number : ");
	number = sc.nextInt();

	
	//calculate digit for reverse number
	int n = number ;
	
	d1 = n % 10;
	n = n / 10 ;
	
	d2 = n % 10 ;
	n = n / 10;
	
	d3 = n % 10;
	
	// # calculate  reverse number
	int reverse = (d1 * 100) + (d2 * 10) + d3 ;
	
	// check and print , number is palindrome or not
	if(number == reverse){
		System.out.printf("number is palindrome");
	
	}
	
	else {
		System.out.printf("number is not palindrome");
	}

        }
}