/* Print table for given number.
Input: n = 5
Output: 5 10 15 20 25 30 35 40 45 50 */

import java.util.Scanner;

public class q2 {

    public static void main(String args[]) {

        int n = 5 , i = 1;
	
	while(i <= 10) {
		
		n = 5*i ;
		System.out.printf("%d  ", n);
		i++ ;
	}

	
	
        }
}