/* Check the given number is Armstrong number or not..
Input: n = 153
Output: Armstrong  
An Armstrong number (also called a narcissistic number) is a number that is equal to the sum of its digits raised to the power of the number of digits.

Example 1: 153 (3-digit number)
Number of digits = 3
Digits: 1, 5, 3

Calculation:
Sum: 1 + 125 + 27 = 153

So, 153 is an Armstrong number*/

void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	// count the total digit
	int count = 0 ; 
	int temp = n ;
	while(temp > 0) {
		temp = temp / 10 ;
		count ++ ;
	}
	
	//calculate  sum
	temp = n ;
	int sum = 0 ;
	while(temp > 0 ) {
		int	digit = temp % 10 ;
		sum = sum + pow(digit , count);
		temp = temp / 10 ;
	}
	
	
	if(sum == n){
		printf("Armstrong");
	}
	
	else {
		printf("not Armstrong");
	}
	
	
}