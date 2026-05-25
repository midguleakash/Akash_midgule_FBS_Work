//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.

import java.util.Scanner;

public class q1 {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		float n1 , n2 ,  ans;
		char op ;
		System.out.printf("enter 1st number : ");
		n1 = sc.nextFloat();
			
		System.out.printf("enter 2st number : ");
		n2 = sc.nextFloat();

	
		System.out.printf("enter operator (+,-,/,*,'%') : ");
		op = sc.next().charAt(0);

	
		if(op == '+') {
			ans = n1 + n2 ;
			System.out.printf("answer is : %f", ans);
		}
	
		else if(op == '-') {
			ans = n1 - n2 ;
			System.out.printf("answer is : %f", ans);
		}
	
		else if(op == '/') {
			ans = n1 / n2 ;
			System.out.printf("answer is : %f", ans);
		}
	
		else if(op == '*') {
			ans = n1 * n2 ;
			System.out.printf("answer is : %f", ans);
		}
	
		else if(op == '%') {
			ans = (int)n1 % (int)n2 ;
			System.out.printf("answer is : %f", ans);
		}
	
		else {
			System.out.printf("enter valid operator : ");
		}

	}
}

