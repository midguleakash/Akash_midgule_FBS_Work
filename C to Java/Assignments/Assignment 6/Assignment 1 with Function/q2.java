/* Print armstrong numbers in the given range 1 to n.
*/

import java.util.Scanner;

public class q2 {
	
	

	

	static int count(int n){
		int count = 0 ;
		while(n > 0) {
			n = n / 10;
			count ++ ;
		}
	
		return count ;
	}


	static int power(int n , int count){
		int power=1;
		for(int i=1; i <= count; i++){
			power = n * power ;
		} 
	
		return power ;
	}


	static void armstrong(int n) {
		for(int i = 1 ; i <= n ; i++){
		
			int sum = 0 ;
			int temp = i ;
		
			int cnt = count(i);
				while(temp > 0 ) {
					int	digit = temp % 10 ;
					sum = sum + power(digit , cnt);
					temp = temp / 10 ;
				}
		
			if(i == sum){
				System.out.printf("%d ", i);
			}
		}
	}


	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n ;
		System.out.printf("enter range n : ");
		n = sc.nextInt();

		armstrong(n);
	
	}


}