/* Find factorial of given number.
Input: n = 5
Output: 120  */

import java.util.Scanner;

public class q7 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int n ;
	
		System.out.printf("enter number : ");
		n = sc.nextInt();

	
	
		int fact = 1 ;
		for(int i = 1 ; i <= n ; i++){
			fact = fact * i ;
		}
	
		System.out.printf("factorial is : %d", fact);
	

	}

}