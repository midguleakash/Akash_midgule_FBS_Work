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



void main() {
	
	int n , sum = 0 , temp , digit ;
	
	printf("enter number : ");
	scanf("%d" , &n);
	
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
		printf("is a strong number");
		
	}
	
	else {
		printf("is not strong number");
	}
}