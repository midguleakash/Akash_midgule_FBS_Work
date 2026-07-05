/* Check the given number is Strong number or not.
Input: n = 145
Output: Strong  

A Strong Number is a number in which the sum of the factorials of its digits is equal to the original number.

Example 1: 145

Digits: 1, 4, 5

Factorials:
1! = 1
4! = 24
5! = 120

Sum: 1 + 24 + 120 = 145

So, 145 is a Strong Number*/


import java.util.Scanner;

public class q8 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);


		int n , sum = 0 , temp , digit ;
	
		System.out.printf("enter n : ");
		n = sc.nextInt();

	
	
		temp = n ;
	
		while(temp > 0){
			digit = temp % 10 ;
			temp = temp / 10 ;
		
			int fact = 1 ;
		
			for(int i = 1 ; i <= digit ; i++) {
				fact = fact * i ;
			}
		
			sum = sum + fact ;
		
		}
	
		if(sum == n) {
			System.out.printf("is a strong number");
		
		}
	
		else {
			System.out.printf("is not strong number");
		}


	}

}