/* Find Sum of first and last digit of given number.
Input: n = 12345
Output: 6 (1 + 5)
*/


void main() {
	
	unsigned long long int  n , firstDigit , lastDigit , sum , digit;
	printf("enter number : ");
	scanf("%llu", &n);
	
	lastDigit = n % 10 ;
	
	while(n > 0) {
		digit = n % 10 ;
		n = n / 10 ;
	}
	
	firstDigit = digit ;
	sum = firstDigit + lastDigit ;
	
	printf("Sum of first and last digit : %d" , sum);
	
	
}