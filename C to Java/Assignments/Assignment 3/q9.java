/* Check the given number is Palindrome number or not.
Input: n = 121
Output: Palindrome  

A Palindrome Number is a number that remains the same when its digits are reversed.

Example 1: 121
Reverse of 121 = 121
? Same ? Palindrome
*/


import java.util.Scanner;

public class q9 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int n , reverse = 0 , digit ;
	
		System.out.printf("enter n : ");
		n = sc.nextInt();

	
	
		int temp = n ;
	
		while(temp > 0) {
			digit = temp % 10 ;
			temp = temp / 10 ;		
		
			reverse = reverse * 10 + digit;
		
		}
	
		// check palindrome
		if(reverse == n) {
        		System.out.printf("Palindrome");
 	 	}
		else {
      			System.out.printf("Not Palindrome");
    		}


	}

}