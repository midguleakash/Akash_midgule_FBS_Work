/* Check the given number is prime or not.
Input: n = 7
Output: Prime  */

import java.util.Scanner;

public class q4 {

    public static void main(String args[]) {

       		 int n = 7 ,flag = 1 ;
	
		if(n <= 1) {
			flag = 0 ;
		}

		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0) {
				flag = 0 ;
				break ;
			}
		}
	
	
		if(flag == 1) {
			System.out.printf("is prime") ;
		}
	
		else {
			System.out.printf("is not prime") ;
		}

	} 

	

}