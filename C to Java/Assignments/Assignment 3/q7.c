/* Find factorial of given number.
Input: n = 5
Output: 120  */

void main() {
	
	int n ;
	printf("enter number : ");
	scanf("%d" , &n);
	
	int fact = 1 ;
	for(int i = 1 ; i <= n ; i++){
		fact = fact * i ;
	}
	
	printf("factorial is : %d", fact);
}