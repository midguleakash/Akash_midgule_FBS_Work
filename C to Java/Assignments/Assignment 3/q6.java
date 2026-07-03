/* Check the given number is Perfect number or not.
Input: n = 28
Output: Perfect 

A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).

Example 2: 28

Factors: 1, 2, 4, 7, 14

Sum: 1 + 2 + 4 + 7 + 14 = 28

So, 28 is also a Perfect Number */

import java.util.Scanner;

public class q6 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int n ;
	
		System.out.printf("enter number : ");
		n = sc.nextInt();

	
	
		int sum = 0 ;
	
		for(int i = 1 ; i <= n / 2 ; i++){
			if(n % i == 0) {
				sum = sum + i ;
			}
		}
	
		if(sum == n){
			System.out.printf("Perfect number");
		}
	
		else {
			System.out.printf("not Perfect number");
		}


	}

}