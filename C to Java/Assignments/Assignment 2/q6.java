/* Accept a number and check if it is divisible by 3, 5, or both.
(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
both" or” Divisible by None”)	*/

import java.util.Scanner;

public class q6 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int n ;
	
		System.out.printf("enter number : ");
		n = sc.nextFloat();

	
	
		if((n % 3 == 0) && (n % 5 != 0))  {
			System.out.printf("Divisible by 3 but not by 5");
		}
	
		else if((n % 5 == 0) && (n % 3 != 0))  {
			System.out.printf("Divisible by 5 but not by 3");
		}
	
		else if((n % 3 == 0) && (n % 5 == 0))  {
			System.out.printf("Divisible by both 3 and 5");
		}
	
		else  {
			System.out.printf("Divisible by None");
		}


	}

}